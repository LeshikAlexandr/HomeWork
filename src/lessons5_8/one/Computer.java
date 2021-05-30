package lessons5_8.one;

import java.util.Random;
import java.util.Scanner;

public class Computer extends ElectricalEquipment {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    RAM ram;
    HDD hdd;
    Processor processor;
    int resource;
    boolean work = true;

    public Computer(int serialNumber, RAM ram, HDD hdd, Processor processor, int resource) {
        setSerialNumber(serialNumber);
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
        this.resource = resource;
    }

    @Override
    public void showInformation() {
        System.out.println("Computer information:");
        System.out.println("serial number - " + getSerialNumber() + ", resource - " + resource);
        ram.showInformation();
        hdd.showInformation();
        processor.showInformation();
    }


    public void on() {
        if (work) {
            System.out.println("Enter 0 or 1");
            int shot = scanner.nextInt();
            int randomShot = random.nextInt(2);
            if (shot == randomShot) {
                System.out.println("Computer on" + "\n");
            } else {
                System.out.println("Computer burned out, when you tried to turn it on");
                work = false;
            }
        } else {
            System.out.println("Computer not work");
        }
    }

    public boolean off() {
        if (work) {
            System.out.println("Enter 0 or 1");
            int shot = scanner.nextInt();
            int thisShot = random.nextInt(2);
            if (shot == thisShot) {
                System.out.println("Computer off, resource: " + --resource + "\n");
                return true;
            } else {
                System.out.println("Computer burned out, when you tried to turn it off");
                work = false;
                return false;
            }
        } else {
            System.out.println("Computer not work");
        }
        checkResource();
        return work;
    }

    public void checkResource() {
        if (resource == 0) {
            System.out.println("Sorry, end of resource, computer burned out");
            work = false;
        }
    }
}
