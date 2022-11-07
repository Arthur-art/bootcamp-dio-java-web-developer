package src.strategy;

public class Main {
    public static void main(String[] args) {

        AggressiveBehavior aggressiveBehavior = new AggressiveBehavior();

        DefensiveBehavior defensiveBehavior = new DefensiveBehavior();

        NormalBehavior normalBehavior = new NormalBehavior();

        Robot robot = new Robot();

        robot.setStrategy(defensiveBehavior);

        robot.mover();

        robot.setStrategy(aggressiveBehavior);

        robot.mover();

        robot.setStrategy(normalBehavior);
        robot.mover();
    }
}
