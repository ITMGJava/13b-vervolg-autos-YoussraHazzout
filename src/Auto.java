public class Auto {

    private int snelheid;
    private String merk;
    private int kilometerstand;
    private String motorMerk;
    private int motorKracht;
    private int motorGewicht;
    private double motorInhoud;

    public static void main(String[] args) {

        // Auto 1 Toyota
        Auto auto = new Auto("Toyota");
        System.out.println(auto.getMerk());
        System.out.println("——————————");
        System.out.println("Snelheid: " + auto.getSnelheid() + "km/hr");
        System.out.println("Kilometerstand:" + auto.getKilometerstand() + "km");
        System.out.println();

        // Auto 2 Tesla
        Auto Tesla = new Auto("Tesla");
        System.out.println(Tesla.getMerk());
        System.out.println("——————————");
        System.out.println("Snelheid: " + Tesla.getSnelheid() + "km/hr");
        System.out.println("Kilometerstand: " + Tesla.getKilometerstand() + "km");
        System.out.println();

        //Auto 3 BMW
        Auto BMW = new Auto(20000, 0, "BMW");
        System.out.println(BMW.getMerk());
        System.out.println("——————————");
        System.out.println("Snelheid: " + BMW.getSnelheid() + "km/hr");
        System.out.println("Kilometerstand: " + BMW.getKilometerstand() + "km");
        System.out.println();
        System.out.println("Motor gegevens");
        System.out.println(auto.motorgegevens());
    }

    // Motor
    public static String motorgegevens() {
        String motorMerk = "Colombo V12";
        System.out.println("De merk van de motor is: " + motorMerk);
        int motorKracht = 580;
        System.out.println("De kracht van de motor is: " + motorKracht + "pk");
        int motorGewicht = 980;
        System.out.println("De gewicht van de motor is: " + motorGewicht + "kg");
        double motorInhoud = 3.8;
        System.out.println("De inhoud van de motor is: " + motorInhoud + "L");
        return motorMerk;
    }

    // Constructor methode
    public Auto(String merk) {
        snelheid = 0;
        //merk = "Toyota"; dit werkt niet, kwam wel door hard input en merk2x was.
        this.merk =merk;
        kilometerstand = 20000;
    }

    public Auto(int kilometerstand, int snelheid, String merk) {
        this.merk =merk;
    }

    // Getter KM stand
    public int getKilometerstand() {
        return kilometerstand;
    }


    // Getter en Setter van Snelheid
    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }

    // Getter en Setter van Merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }


}

