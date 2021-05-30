package lessons5_8.two;

public class CivilTransport extends AirTransport {

    private int countOfPassengers;
    private boolean businessClass;

    public CivilTransport(double power, int maxSpeed, double mass, double wingspan, double take_offLength, String name, int countOfPassengers, boolean businessClass) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setMass(mass);
        setName(name);
        setWingspan(wingspan);
        setTake_offLength(take_offLength);
        this.countOfPassengers = countOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public void showInformation() {
        System.out.println("Civil transportn information:");
        System.out.println("Power: " + getPower() + " horsepower, " + getPower() * 0.74 + " kilowatt");
        System.out.println("Max speed " + getMaxSpeed() + " kilometers per hour");
        System.out.println("Mass: " + getMass() + " kilograms");
        System.out.println("Name: " + getName());
        System.out.println("Wingspan: " + getWingspan());
        System.out.println("Take-off length: " + getTake_offLength());
        System.out.println("Count of passengers: " + countOfPassengers);
        System.out.println("Business class: " + (businessClass ? "yes" : "no"));
    }

    public void calcPassengers(int passengers) {
        if (passengers <= countOfPassengers) {
            System.out.println("Самолет заполнен.");
        } else {
            System.out.println("Вам нужен самолет побольше.");
        }
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
