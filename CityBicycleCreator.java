public class CityBicycleCreator extends BicycleCreator {

    @Override
    public Bicycle createBicycle() {
        return new CityBicycle();
    }
}