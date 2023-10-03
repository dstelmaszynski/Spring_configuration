package pl.zajavka.springConfigByAnnotations.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pl.zajavka.springConfigByAnnotations.code") //adnotacja do wskazywania, gdzie Beany maja byc wyszukiwane
//nie jest koniecznie podanie argumentów w nawiasie, jesli wszystko sie odbywa w 1 paczce

// :::::::::::::: 2 sposób na @ComponentScan ::::::::::::::
//@ComponentScan(basePackageClasses = Marker.class)
// mozna w ten sposob pokazac, gdzie ma szukac Beanów, czyli w paczce, gdzie jest Marker Interface

public class ExampleConfigurationClass {

}
