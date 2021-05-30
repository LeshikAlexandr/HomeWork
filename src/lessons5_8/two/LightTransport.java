package lessons5_8.two;

public class LightTransport extends LandTransport {

    private String bodyType;
    private int countOfPassengers;

    public LightTransport(double power, int maxSpeed, double mass, String name, int countOfWheels, double fuelConsumption, String bodyType, int countOfPassengers) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setMass(mass);
        setName(name);
        setCountOfWheels(countOfWheels);
        setFuelConsumption(fuelConsumption);
        this.bodyType = bodyType;
        this.countOfPassengers = countOfPassengers;
    }

    @Override
    public void showInformation() {
        System.out.println("Light transportn information:");
        System.out.println("Power: " + getPower() + " horsepower, " + getPower() * 0.74 + " kilowatt");
        System.out.println("Max speed " + getMaxSpeed() + " kilometers per hour");
        System.out.println("Mass: " + getMass() + " kilograms");
        System.out.println("Name: " + getName());
        System.out.println("Count of wheels: " + getCountOfWheels());
        System.out.println("Fuel consumption: " + getFuelConsumption());
        System.out.println("Body type: " + bodyType);
        System.out.println("Count of passengers: " + countOfPassengers);
    }

    public void calcDistanceAndFuelConsumption(double time) {
        double distance = getMaxSpeed() * time;
        System.out.println("За время " + time + " ч, автомобиль " + getName() + ", двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет "
                + distance + " км и израсходует "
                + calcConsumption(distance) + " литров топлива.");

    }

    private double calcConsumption(double distance) {
        return distance * getFuelConsumption() / 100;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }
}