package javaspringframework.GameRunner;

import javaspringnetwork.game.GameRunner;
import javaspringnetwork.game.GamingConsole;
import javaspringnetwork.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new Pacman();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
