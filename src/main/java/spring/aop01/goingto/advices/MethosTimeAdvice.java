package spring.aop01.goingto.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Date;

//自定义环绕通知
public class MethosTimeAdvice implements MethodInterceptor {
    /**
     * methodInvocation 获取当前执行方法  获取当前执行方法参数  获取目标对象
     * */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable { //需要放行
        System.out.println("-------进入环绕通知------");
        System.out.println("method ：" + methodInvocation.getMethod() + ",args :" + methodInvocation.getArguments() + ",target : " + methodInvocation.getThis());
        try {
            long start = new Date().getTime();
            Object proceed = methodInvocation.proceed(); //继续处理
            long end = new Date().getTime();
            System.out.println(" method " + methodInvocation.getMethod().getName() + " ,,,,run,,, " + (end-start) + "s");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("exception");
        }
        return null;
    }
}
