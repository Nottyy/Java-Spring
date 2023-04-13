package javaspringnetwork.game;

import org.springframework.stereotype.Component;

@Component

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;
    }
    public void run() {
        System.out.println("Running game: " + this.game.getClass().getSimpleName());
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
