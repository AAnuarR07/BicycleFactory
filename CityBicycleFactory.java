public class CityBicycleFactory implements BicycleFactory {

    @Override
    public Bicycle createBicycle() {
        return new CityBicycle();
    }

    @Override
    public Helmet createHelmet() {
        return new CityHelmet();
    }
}