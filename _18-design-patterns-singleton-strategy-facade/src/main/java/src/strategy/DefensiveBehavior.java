package src.strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente");
    }
}
