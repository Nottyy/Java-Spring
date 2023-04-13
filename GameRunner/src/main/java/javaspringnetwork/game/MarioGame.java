package javaspringnetwork.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("con")
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Mario Up");
    }

    public void down(){
        System.out.println("Mario Down");
    }

    public void right(){
        System.out.println("Mario Right");
    }

    public void left(){
        System.out.println("Mario Left");
    }
}
