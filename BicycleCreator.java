public abstract class BicycleCreator {

    public abstract Bicycle createBicycle();

    public void rideBicycle() {
        Bicycle bicycle = createBicycle();
        bicycle.ride();
    }
}