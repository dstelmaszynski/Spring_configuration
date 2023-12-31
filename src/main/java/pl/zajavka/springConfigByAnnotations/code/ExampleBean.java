package pl.zajavka.springConfigByAnnotations.code;

import lombok.Data;

@Data
public class ExampleBean {
    private final InjectedBean injectedBean;
    private final AnotherInjectedBean anotherInjectedBean;

    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling ExampleBean()");
    }

    public void exampleMethod(){
        System.out.println("Calling exampleMethod()");
    }
}
