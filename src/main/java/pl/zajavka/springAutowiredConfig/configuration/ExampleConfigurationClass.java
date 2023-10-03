package pl.zajavka.springAutowiredConfig.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.springAutowiredConfig.Main;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

}
