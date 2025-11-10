package zona_fit.objetosDoc;

public class MountainBike extends Bicycle{

    private int seatHeight;

    public MountainBike() {}

    public MountainBike(int startGear,int startSpeed , int startCadence ,int seatHeight) {
        super(startGear, startSpeed, startCadence);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }
}
