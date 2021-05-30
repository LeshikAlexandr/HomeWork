package lessons5_8.one;

public abstract class ElectricalEquipment {

    private int serialNumber;

    public abstract void showInformation();

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
