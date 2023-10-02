package pl.zajavka.springConfigJavaClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created");

        //Poniżej podanie nazwy: "exampleBean" nie jest konieczne, jesli mamy w kontekscie tylko 1 bean
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.exampleMethod();
    }
}
