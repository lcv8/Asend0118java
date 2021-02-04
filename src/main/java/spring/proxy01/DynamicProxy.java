package spring.proxy01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static void main(String[] args) {
        // Proxy 用来生成动态代理的类
        /**
        * 1.classLoader 类加载
        * 2.class[] 动态代理对象的接口类型的数组
        * 3.InvocationHandler  invoke 方法
         * @return 创建好的代理对象
        * */

        //classLoader
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        //class[] 目标对象接口的类型的数组
        Class[] classes = {UserService.class};

        //返回值 创建好的动态代理对象
        UserService proxy = (UserService) Proxy.newProxyInstance(contextClassLoader, classes, new InvocationHandler() {
            //通过动态代理对象调用自己里面代理方法时会优先指定invokcationHandler类中invoke
            /**
             * 1.当前创建好的代理对象
             * 2.当前代理对象执行的方法对象
             * 3.当前代理对象执行方法的参数
             * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("当前执行的方法 ：" + method.getName());
                System.out.println("当前执行的参数 :" + args[0]);

                try{
                    System.out.println("开启事务");
                    //调用目标类中业务方法通过反射机制 调用目标类中当前方法
                    Object invoke = method.invoke(new UserImpl(), args);
                    System.out.println("提交事务");
                    return invoke;
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("回滚");
                }
                return null;
            }
        });
        proxy.delect("zhangsan");
    }
}
