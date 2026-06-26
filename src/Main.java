//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("R2D2", 100, "blau");
        String robotName = myRobot.getName();
        System.out.println("Mein Roboter heißt " + robotName);

        myRobot.setName("Dalek");
        System.out.println("Mein Roboter heißt " + myRobot.getName());



        Robot secondRobot = new Robot("Wall-E", 60, "gelb");
        //System.out.println(myRobot.calculateBMI(80,180));
    }
}