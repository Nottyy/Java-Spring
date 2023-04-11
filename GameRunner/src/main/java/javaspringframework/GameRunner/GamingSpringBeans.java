package javaspringframework.GameRunner;

import javaspringnetwork.game.GameRunner;
import javaspringnetwork.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).left();
            context.getBean(GameRunner.class).run();

        }
    }
}
