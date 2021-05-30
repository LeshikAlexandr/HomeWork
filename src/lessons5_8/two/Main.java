package lessons5_8.two;

public class Main {
    public static void main(String[] args) {
//        LightTransport peugeot = new LightTransport(190, 250, 1750, "Peugeot 406", 4, 7, "sedan", 5);
//        peugeot.showInformation();
//
//        System.out.println();
//        peugeot.calcDistanceAndFuelConsumption(2);

//        FreightTransport maz = new FreightTransport(300, 200, 10000, "MAZ", 6, 20, 20000);
//        maz.showInformation();
//
//        System.out.println();
//        maz.calcLiftingCapacity(21000);

//        CivilTransport stratolaunch = new CivilTransport(700000, 400, 59000, 117.3, 5000, "Stratolaunch", 2000, true);
//        stratolaunch.calcPassengers(500);

        MilitaryTransport su57 = new MilitaryTransport(300000, 2440, 20000, 14, 1000, "su57", 2, true);
        su57.showInformation();
        su57.shot();
        su57.eject();

    }
}
