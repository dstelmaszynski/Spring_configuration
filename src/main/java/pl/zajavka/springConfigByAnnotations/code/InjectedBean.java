package pl.zajavka.springConfigByAnnotations.code;

import org.springframework.stereotype.Service;

@Service
//Ta klasa ma spełniac jaką logikę biznesową
public class InjectedBean {
    public InjectedBean() {
        System.out.println("Calling InjectedBean()");
    }

    public void someMethod(){
        System.out.println("Calling InjectedBean #someMethod()");
    }

}
