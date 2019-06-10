
package com.mycompany;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main(String[] args) 
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        MessageRendererErrorImp imr= ctx.getBean(MessageRendererErrorImp.class);
        imr.printMessage();
    }
}
