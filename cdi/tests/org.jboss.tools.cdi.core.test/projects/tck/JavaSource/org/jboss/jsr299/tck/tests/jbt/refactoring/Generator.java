package org.jboss.jsr299.tck.tests.jbt.refactoring;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@ApplicationScoped
public class Generator implements Serializable 
{
   private static final long serialVersionUID = -7213673465118041882L;

   private java.util.Random random = new java.util.Random(System.currentTimeMillis());
   
   private int maxNumber = 100;
   
   java.util.Random getRandom()
   {
	   String s = "#{gamme}";
      return random;
   }
   
   @Produces @Random int next()
   {
      return getRandom().nextInt(maxNumber); 
   }
   
   @Produces @MaxNumber int getMaxNumber()
   {
      return maxNumber;
   }
} 

@Named("another")
class AnotherOne {
	
}