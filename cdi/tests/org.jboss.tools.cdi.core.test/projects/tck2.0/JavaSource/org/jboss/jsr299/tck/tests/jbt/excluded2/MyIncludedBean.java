package org.jboss.jsr299.tck.tests.jbt.excluded2;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Named;

@Named("myIncludedBean")
class MyIncludedBean {
   private int value = 0;

   public int getValue() {
      return value;
   }

   public void setValue(int value) {
      this.value = value;
   }
}