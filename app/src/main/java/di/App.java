package di;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new App().getGreeting());
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml.xml");


        applicationContext.getBean("exampleBean2", ExampleBean2.class);
        //System.out.println(applicationContext.getBean("beanOne").getClass());
        //ExampleBean exampleBean = applicationContext.getBean("exampleBean", ExampleBean.class);


        //  System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));


/*
        ThingOne thingOne = applicationContext.getBean("beanOne", ThingOne.class);
        System.out.println(thingOne.thingTwo.getDate());

        Thread.sleep(1000);

        // ThingTwo thingOne1 = applicationContext.getBean("beanOne", ThingTwo.class);
        // System.out.println(thingOne1.thingTwo.getDate());

        System.out.println(thingOne.thingTwo.getClass());
        System.out.println(thingOne.integerProperty);*/
    }
}
