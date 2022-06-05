import animals.Fish;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Zoo zoo = context.getBean("zoo",Zoo.class);
        System.out.println(zoo.getAnimals());

        Fish fish1 = context.getBean("fish",Fish.class);
        Fish fish2 = context.getBean("fish",Fish.class);
        fish2.setName("Reserve Roy");

        System.out.println(fish1.getName());
        System.out.println(fish2.getName());

        context.close();
    }
}
