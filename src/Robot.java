public class Robot {
    private String name;
    private int buildYear;
    private int height;
    private String color;
    private int batteryPower;

    // Konstruktor-Methode
    public Robot(String newName, int newHeight, String color){
        this.name = newName;
        this.height = newHeight;
        this.buildYear = 2026;
        this.color = color;
        this.batteryPower = 100;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    // eher schlechte Praxis
    public void sayName(){
        System.out.println("Hi, my name is " + this.name + "!");
    }

    //Methodenkopf
    public int losePower(){
        //Methodenkörper
        this.batteryPower = this.batteryPower - 1;
        return this.batteryPower;
    }

    //weight in kg, height in cm
    public double calculateBMI(double weight, int height){
        double heightInM = height / 100.0; //umrechnen von cm in m
        double bmi = weight / (heightInM * heightInM);  //bmi formel
        return bmi;
    }
}
