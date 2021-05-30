package lessons5_8.one;

public class HDD extends ElectricalEquipment {

    int cache;
    int capacity;

    public HDD(int serialNumber, int cache, int capacity) {
        setSerialNumber(serialNumber);
        this.cache = cache;
        this.capacity = capacity;
    }

    @Override
    public void showInformation() {
        System.out.println("HDD information:");
        System.out.println("serial number - " + getSerialNumber() + ", cache - " + cache + ", capacity - " + capacity);
    }
}
