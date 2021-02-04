package spring.ioc01;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

//在工厂中创建复杂类型
public class CalendarFactoryBean implements FactoryBean<Calendar> {
    //书写复杂类型的常见方式
    @Override
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    //指定创建的复杂对象的类型
    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    //是不是单例模式  true单例  false多例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
