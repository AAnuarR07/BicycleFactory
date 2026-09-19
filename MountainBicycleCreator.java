public class MountainBicycleCreator extends BicycleCreator {

    @Override
    public Bicycle createBicycle() {
        return new MountainBicycle();
    }
}