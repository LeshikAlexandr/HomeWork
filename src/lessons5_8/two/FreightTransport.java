package lessons5_8.two;

public class FreightTransport extends LandTransport {

    private double liftingCapacity;

    public FreightTransport(double power, int maxSpeed, double mass, String name, int countOfWheels, double fuelConsumption, double liftingCapacity) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setMass(mass);
        setName(name);
        setCountOfWheels(countOfWheels);
        setFuelConsumption(fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void showInformation() {
        System.out.println("Freight transportn information:");
        System.out.println("Power: " + getPower() + " horsepower, " + getPower() * 0.74 + " kilowatt");
        System.out.println("Max speed " + getMaxSpeed() + " kilometers per hour");
        System.out.println("Mass: " + getMass() + " kilograms");
        System.out.println("Name: " + getName());
        System.out.println("Count of wheels: " + getCountOfWheels());
        System.out.println("Fuel consumption: " + getFuelConsumption());
        System.out.println("Lifting capacity: " + liftingCapacity);
    }

    public void calcLiftingCapacity(double enter) {
        if (enter <= liftingCapacity) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
}
