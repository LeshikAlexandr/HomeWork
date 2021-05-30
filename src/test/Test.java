package test;

public class Test {
    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        Test test2 = new Test();

        test.doWork();
        test2.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);

    }

    private synchronized void increment() {
//        String name = Thread.currentThread().getName();
//        System.out.println(name);
        counter++;
    }
}
