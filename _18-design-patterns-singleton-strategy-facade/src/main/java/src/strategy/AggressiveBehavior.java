package src.strategy;

public class AggressiveBehavior implements Behavior{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente");
    }
}
