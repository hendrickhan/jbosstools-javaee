package org.jboss.tools.cdi.seam.text.ext.test;

import java.util.ArrayList;

import org.jboss.tools.cdi.seam.config.core.test.SeamConfigTest;
import org.jboss.tools.cdi.seam.text.ext.hyperlink.XMLInjectedPointHyperlinkDetector;
import org.jboss.tools.cdi.text.ext.CDIExtensionsMessages;
import org.jboss.tools.cdi.text.ext.hyperlink.InjectedPointHyperlink;
import org.jboss.tools.cdi.text.ext.test.CDIHyperlinkTestUtil;
import org.jboss.tools.cdi.text.ext.test.CDIHyperlinkTestUtil.TestHyperlink;
import org.jboss.tools.cdi.text.ext.test.CDIHyperlinkTestUtil.TestRegion;

public class XMLInjectedPointHyperlinkDetectorTest extends SeamConfigTest{
	private static final String FILENAME = "src/META-INF/seam-beans.xml";
	
	public void testXMLInjectedPointHyperlinkDetector() throws Exception {
		ArrayList<TestRegion> regionList = new ArrayList<TestRegion>();
		
		regionList.add(new TestRegion(/*2166, 15*/"<test04:myType6", new TestHyperlink[]{
				new TestHyperlink(InjectedPointHyperlink.class, CDIExtensionsMessages.CDI_INJECTED_POINT_HYPERLINK_OPEN_INJECT_BEAN+ " MyBean6.myType6")
				//new TestHyperlink(AlternativeInjectedPointListHyperlink.class, CDIExtensionsMessages.CDI_INJECTED_POINT_HYPERLINK_SHOW_ALTERNATIVES)
		}));
		 
		CDIHyperlinkTestUtil.checkRegions(project, FILENAME, regionList, new XMLInjectedPointHyperlinkDetector());
	}

}
