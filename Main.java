public class Main {

    public static void main(String[] args) {

        System.out.println("Factory Method: \n");

        BicycleCreator mountainCreator = new MountainBicycleCreator();
        Bicycle mountainBike = mountainCreator.createBicycle();

        BicycleCreator cityCreator = new CityBicycleCreator();
        Bicycle cityBike = cityCreator.createBicycle();

        mountainBike.ride();
        cityBike.ride();

        System.out.println("\n--- --- --- --- ---");

        System.out.println("\nAbstract Factory: \n");

        BicycleFactory mountainFactory = new MountainBicycleFactory();

        Bicycle mountainBicycle = mountainFactory.createBicycle();
        Helmet mountainHelmet = mountainFactory.createHelmet();

        mountainBicycle.ride();
        mountainHelmet.wear();
        
        BicycleFactory cityFactory = new CityBicycleFactory();

        Bicycle cityBicycle = cityFactory.createBicycle();
        Helmet cityHelmet = cityFactory.createHelmet();

        cityBicycle.ride();
        cityHelmet.wear();
    }
}