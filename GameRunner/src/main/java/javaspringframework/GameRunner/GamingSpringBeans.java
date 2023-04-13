package javaspringframework.GameRunner;

import javaspringnetwork.game.GameRunner;
import javaspringnetwork.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaspringnetwork.game")
public class GamingSpringBeans {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingSpringBeans.class)){
            context.getBean(GameRunner.class).run();
            context.getBean(GamingConsole.class).left();
        }
    }
}
