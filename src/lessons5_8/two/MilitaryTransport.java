package lessons5_8.two;

public class MilitaryTransport extends AirTransport {

    private int countOfMissiles;
    private boolean ejectionSystem;

    public MilitaryTransport(double power, int maxSpeed, double mass, double wingspan, double take_offLength, String name, int countOfMissiles, boolean ejectionSystem) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setMass(mass);
        setName(name);
        setWingspan(wingspan);
        setTake_offLength(take_offLength);
        this.countOfMissiles = countOfMissiles;
        this.ejectionSystem = ejectionSystem;
    }

    public void showInformation() {
        System.out.println("Military transport information:");
        System.out.println("Power: " + getPower() + " horsepower, " + getPower() * 0.74 + " kilowatt");
        System.out.println("Max speed " + getMaxSpeed() + " kilometers per hour");
        System.out.println("Mass: " + getMass() + " kilograms");
        System.out.println("Name: " + getName());
        System.out.println("Wingspan: " + getWingspan());
        System.out.println("Take-off length: " + getTake_offLength());
        System.out.println("Count of missiles: " + countOfMissiles);
        System.out.println("Ejection system: " + (ejectionSystem ? "yes" : "no"));
    }

    public void shot() {
        if (countOfMissiles > 0) {
            System.out.println("Ракета пошла.");
            countOfMissiles--;
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    public void eject() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }

    public int getCountOfMissiles() {
        return countOfMissiles;
    }

    public void setCountOfMissiles(int countOfMissiles) {
        this.countOfMissiles = countOfMissiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }
}
