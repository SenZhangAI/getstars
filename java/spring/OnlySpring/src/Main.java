import com.github.HelloWorld2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHi();
        HelloWorld2 helloWorld2 = (HelloWorld2) context.getBean("helloWorld2");
        helloWorld2.sayHi();
    }
}
