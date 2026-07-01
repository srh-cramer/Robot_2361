public class Robot {
    private String name;
    private int buildYear;
    private int height;
    private String color;
    private int batteryPower;

    // Konstruktor-Methode
    // legt fest, was beim Instanziieren eines Objektes passieren soll
    public Robot(String newName, int newHeight, String color){
        this.name = newName;
        this.height = newHeight;
        this.buildYear = 2026;
        this.color = color;
        this.batteryPower = 100;
    }

    //neuer Konstruktor, wo buildYear als Parameter mitgegeben wird
    public Robot(String newName, int newHeight, String color, int newBuildYear){
        this.name = newName;
        this.height = newHeight;
        this.buildYear = newBuildYear;
        this.color = color;
        this.batteryPower = 100;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear){
        this.buildYear = buildYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        if (batteryPower >= 0){
            this.batteryPower = batteryPower;
        }
        else{
            System.err.println("BatteryPower kann nicht unter 0 fallen.");
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        // stelle sicher, dass neuer Name nicht leer ist
        // Tipp: String-Methode .isEmpty() benutzen
        // Tipp 2: if-Abfrage einbauen!
        if (!name.isBlank()){
            this.name = name;
        }
        else {
            System.err.println("Fehler: Name fehlt.");
        }
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
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
