package lessons5_8.one;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();


        RAM ram = new RAM(random.nextInt(100000), 2000 + random.nextInt(14001));
        HDD hdd = new HDD(random.nextInt(100000), 8 + random.nextInt(25), 80 + random.nextInt(3921));
        Processor processor = new Processor(random.nextInt(100000), 3000 + random.nextInt(1001));

        Computer computer = new Computer(random.nextInt(100000), ram, hdd, processor, 2);
        computer.showInformation();

        do {
            computer.on();
        }
        while (computer.off());
    }
}
