package springMybatis;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransactionAdvice implements MethodInterceptor {

    private PlatformTransactionManager transactionManager;

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        //获取事务状态
        TransactionStatus status = transactionManager.getTransaction(definition);
        //放行目标方法
        try {
            Object proceed = methodInvocation.proceed();
            transactionManager.commit(status);//提交事务
        } catch (Exception e){
            transactionManager.rollback(status);
        }
        return null;
    }
}
