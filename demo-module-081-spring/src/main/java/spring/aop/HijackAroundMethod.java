package spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class HijackAroundMethod implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("Method name : " + methodInvocation.getMethod().getName());
        System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));

        System.out.println("HijackAroundMethod : Before method hijacked!");

        Object result = methodInvocation.proceed();

        System.out.println("HijackAroundMethod : After method hijacked!");

        return null;
    }
}
