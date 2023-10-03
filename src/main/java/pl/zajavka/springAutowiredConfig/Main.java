package pl.zajavka.springAutowiredConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.springAutowiredConfig.code.ExampleBean;
import pl.zajavka.springAutowiredConfig.code.InjectedBean;
import pl.zajavka.springAutowiredConfig.configuration.ExampleConfigurationClass;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created");
        ExampleBean bean = context.getBean(ExampleBean.class);
        bean.exampleMethod();
    }
}
