package javaspringnetwork.game;

public class Pacman implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Pacman Up");
    }

    @Override
    public void down() {
        System.out.println("Pacman Down");
    }

    @Override
    public void left() {
        System.out.println("Pacman Left");
    }

    @Override
    public void right() {
        System.out.println("Pacman Right");
    }
}
