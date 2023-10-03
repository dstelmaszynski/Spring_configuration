package pl.zajavka.springAutowiredConfig.code;

import org.springframework.stereotype.Component;

@Component
//Ta klasa reprezentuje Beana o zastosowaniu ogólnym
public class AnotherInjectedBean {
    public AnotherInjectedBean(){
        System.out.println("Calling AnotherInjectedBean()");
    }
}
