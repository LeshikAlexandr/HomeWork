package lessons5_8.one;

public class Processor extends ElectricalEquipment {

    int frequency;

    public Processor(int serialNumber, int frequency) {
        setSerialNumber(serialNumber);
        this.frequency = frequency;
    }

    @Override
    public void showInformation() {
        System.out.println("Processor information:");
        System.out.println("serial number - " + getSerialNumber() + ", frequency - " + frequency);
    }
}
