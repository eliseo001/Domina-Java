package zona_fit.objetosDoc;

public class Bicycle {
    private int cadence;
    private int speed;
    private int gear = 1;
    private int id;
    private static int numberOfBicycle = 0;

    public Bicycle() {
        // SOLUCIÓN: Añadir la asignación de ID
        this.id = numberOfBicycle++;
    }

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
        this.id = numberOfBicycle++;
    }

    public Bicycle(int startCadence, int startSpeed, int startGear, int startId) {
        gear = startGear;
        speed = startSpeed;
        cadence = startCadence;
        id = numberOfBicycle++;
    }

    void printStates(){
        System.out.println("id:" + id +
                " cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getId(){
        return id;
    }

    public static int getNumberOfBicycle() {
        return numberOfBicycle;
    }
}
