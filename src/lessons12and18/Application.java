package lessons12and18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    private Scanner scanner = new Scanner(System.in);
    private Shop shop;

    public Application() {
        System.out.println("Welcome to the store!");
        shop = new Shop();
    }

    public void start() {
        boolean go = true;
        while (go) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Out of all products.");
            System.out.println("2. Adding products.");
            System.out.println("3. Remove products.");
            System.out.println("4. Product editing.");
            System.out.println("5. Exit. \n");
            System.out.println("Enter the number:");
            try {
                int choice = scanner.nextInt();
                while (choice < 1 || choice > 5) {
                    System.out.println("The entered number must be between 1 and 5, try again:");
                    choice = scanner.nextInt();
                }
                go = router(choice);
            } catch (InputMismatchException e) {
                System.out.println("Your choice must be numeric, try again:");
                scanner.nextLine();
                start();
            }
        }
    }

    private boolean router(int choice) {
        switch (choice) {
            case 1:
                outOfAllProducts();
                break;
            case 2:
                addingProducts();
                break;
            case 3:
                removeProducts();
                break;
            case 4:
                productEditing();
                break;
            case 5:
                return false;
        }
        return true;
    }

    private void outOfAllProducts() {
        if (shop.checkEmptyList()) {
            return;
        }
        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                shop.writeProducts();
            }
        });
        newThread.start();
        System.out.println("In what order to withdraw products?");
        System.out.println("1. Output by price ascending");
        System.out.println("2. Output by price descending");
        System.out.println("3. Output by occurrence order");
        try {
            int choice = scanner.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("The entered number must be between 1 and 3, try again:");
                choice = scanner.nextInt();
            }
            if (choice == 1) {
                shop.outputByPriceAscending();
            } else if (choice == 2) {
                shop.outputByPriceDescending();
            } else {
                shop.outputByOccurrenceOrder();
            }
        } catch (InputMismatchException e) {
            System.out.println("Your choice must be numeric, try again:");
            scanner.nextLine();
            outOfAllProducts();
        }
    }

    private void addingProducts() {
        shop.addingAProduct();
    }

    private void removeProducts() {
        shop.removeProductById();
    }

    private void productEditing() {
        shop.productEditing();
    }
}