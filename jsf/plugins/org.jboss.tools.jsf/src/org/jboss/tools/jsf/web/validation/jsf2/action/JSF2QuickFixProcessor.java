/*******************************************************************************
 * Copyright (c) 2007-2010 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.jboss.tools.jsf.web.validation.jsf2.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.wst.sse.ui.StructuredTextInvocationContext;
import org.jboss.tools.jsf.jsf2.util.JSF2ResourceUtil;
import org.jboss.tools.jsf.web.validation.jsf2.util.JSF2ValidatorConstants;

/**
 * 
 * @author yzhishko
 *
 */

public class JSF2QuickFixProcessor implements IQuickAssistProcessor {

	public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
		return false;
	}

	public boolean canFix(Annotation annotation) {
		return false;
	}

	public ICompletionProposal[] computeQuickAssistProposals(
			IQuickAssistInvocationContext invocationContext) {
//		if (invocationContext instanceof StructuredTextInvocationContext) {
//			StructuredTextInvocationContext context = (StructuredTextInvocationContext) invocationContext;
//			String type = (String) context
//					.getAttribute(JSF2ValidatorConstants.JSF2_TYPE_KEY);
//			IResource resource = ResourcesPlugin.getWorkspace().getRoot()
//					.findMember(
//							(String) context
//									.getAttribute("validateResourcePath")); //$NON-NLS-1$
//			String compPath = (String) context
//					.getAttribute(JSF2ResourceUtil.COMPONENT_RESOURCE_PATH_KEY);
//
//			if (type.equals(JSF2ValidatorConstants.JSF2_FIXABLE_ATTR_TYPE)) {
//				String[] attrs = new String[] { (String) context
//						.getAttribute(JSF2ValidatorConstants.JSF2_ATTR_NAME_KEY) };
//				ICompletionProposal proposal = new JSF2CompositeAttrsProposal(
//						resource, compPath, attrs,(String)context.getAttribute(JSF2ValidatorConstants.JSF2_ATTR_NAME_KEY),
//						(String)context.getAttribute(JSF2ResourceUtil.JSF2_COMPONENT_NAME));
//				return new ICompletionProposal[] { proposal };
//			} else if (type
//					.equals(JSF2ValidatorConstants.JSF2_COMPOSITE_COMPONENT_TYPE)) {
//				ICompletionProposal proposal = new JSF2CompositeComponentProposal(
//						resource, compPath, retriveAttrsFromContext(context),(String)context.getAttribute(JSF2ResourceUtil.JSF2_COMPONENT_NAME));
//				return new ICompletionProposal[] { proposal };
//			} else if (type.equals(JSF2ValidatorConstants.JSF2_URI_TYPE)) {
//				String uriPath = (String) context
//						.getAttribute(JSF2ValidatorConstants.JSF2_URI_NAME_KEY);
//				ICompletionProposal proposal = new JSF2ResourcesFolderProposal(
//						resource, uriPath,(String)context.getAttribute(JSF2ValidatorConstants.JSF2_URI_NAME_KEY));
//				return new ICompletionProposal[] { proposal };
//			}
//		}
		return null;
	}

	private String[] retriveAttrsFromContext(
			StructuredTextInvocationContext context) {
		List<String> attrsList = new ArrayList<String>();
		int i = 0;
		while (!(context
				.getAttribute(JSF2ValidatorConstants.JSF2_ATTR_NAME_KEY
						+ String.valueOf(i)) == null)) {
			attrsList.add((String) context
					.getAttribute(JSF2ValidatorConstants.JSF2_ATTR_NAME_KEY
							+ String.valueOf(i)));
			i++;
		}
		return attrsList.toArray(new String[0]);
	}

	public String getErrorMessage() {
		return null;
	}

}
