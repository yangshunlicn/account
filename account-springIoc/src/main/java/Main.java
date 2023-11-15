import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:Main
 *
 * @Author Yang ShunLi
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        System.out.println("创建ioc容器");
    }
}