package zona_fit.objetosDoc;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        Bicycle myBike = new Bicycle(1, 10, 0);
        MountainBike mountainBike1 = new MountainBike();

        bike1.changeCadence(50);
        bike1.speedUp(20);
        bike1.changeGear(36);
        bike1.printStates();

        bike2.changeCadence(11);
        bike2.speedUp(34);
        bike2.changeGear(2);
        bike2.printStates();
        bike2.applyBrakes(30);
        bike2.printStates();
    }
}
