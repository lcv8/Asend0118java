package spring.aop01;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//自定义记录业务方法名称前置通知
public class MyBeforeAdvice implements MethodBeforeAdvice {
    /**
     * 1.当前执行方法对象
     * 2.参数对象
     * 3.目标对象，被代理的对象
     * */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("methos :" + method.getName() + "orgs:" + args[0] + "target :" + target);
    }
}
