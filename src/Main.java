//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("R2D2", 100, "blau");
        Robot c3po = new Robot("C3PO", 170, "Gold", 1977);

        System.out.println(myRobot.getBuildYear());
        System.out.println(c3po.getBuildYear());

        //String name = myRobot.name;
        String robotName = myRobot.getName();
        System.out.println("Mein Roboter heißt " + robotName);

        myRobot.setName("  ");
        System.out.println("Mein Roboter heißt " + myRobot.getName());

        int robotHeight = myRobot.getHeight();
        System.out.println("Mein Roboter ist " + robotHeight + " cm groß.");

        myRobot.setHeight(150);
        System.out.println("Neue Größe vom Roboter: " + myRobot.getHeight());

        Robot secondRobot = new Robot("Wall-E", 60, "gelb");
        //System.out.println(myRobot.calculateBMI(80,180));
    }
}