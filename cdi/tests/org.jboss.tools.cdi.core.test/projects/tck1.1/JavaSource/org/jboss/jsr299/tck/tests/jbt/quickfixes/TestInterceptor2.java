package org.jboss.jsr299.tck.tests.jbt.quickfixes;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@Inherited
@InterceptorBinding
@Target( { TYPE, METHOD })
@Retention(RUNTIME)
public @interface TestInterceptor2 {
	String[] abc();
}
