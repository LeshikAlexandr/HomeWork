package lessons5_8.one;

public class RAM extends ElectricalEquipment {

    int capacity;

    public RAM(int serialNumber, int capacity) {
        this.capacity = capacity;
        setSerialNumber(serialNumber);
    }

    @Override
    public void showInformation() {
        System.out.println("RAM information:");
        System.out.println("serial number - " + getSerialNumber() + ", capacity - " + capacity);
    }
}
