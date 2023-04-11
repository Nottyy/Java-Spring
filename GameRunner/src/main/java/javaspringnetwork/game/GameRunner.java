package javaspringnetwork.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + this.game);
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}