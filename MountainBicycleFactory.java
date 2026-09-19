public class MountainBicycleFactory implements BicycleFactory {

    @Override
    public Bicycle createBicycle() {
        return new MountainBicycle();
    }

    @Override
    public Helmet createHelmet() {
        return new MountainHelmet();
    }
}