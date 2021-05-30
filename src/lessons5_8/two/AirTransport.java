package lessons5_8.two;

public abstract class AirTransport extends Transport {

    private double wingspan;
    private double take_offLength;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getTake_offLength() {
        return take_offLength;
    }

    public void setTake_offLength(double take_offLength) {
        this.take_offLength = take_offLength;
    }
}
