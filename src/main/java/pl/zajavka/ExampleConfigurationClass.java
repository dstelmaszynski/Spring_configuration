package pl.zajavka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfigurationClass {
    @Bean
    public ExampleBean exampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean){
        return new ExampleBean(injectedBean, anotherInjectedBean);
    }

    @Bean
    InjectedBean injectedBean(){
        return new InjectedBean();
    }

    @Bean
    AnotherInjectedBean anotherInjectedBean(){
        return new AnotherInjectedBean();
    }
}
