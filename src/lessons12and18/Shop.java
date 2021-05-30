package lessons12and18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Shop {

    private List<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addingAProduct() {

        System.out.println("Enter the id, name and price.");
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            while (id < 1) {
                System.out.println("ID must be greater then zero.");
                System.out.print("ID: ");
                id = scanner.nextInt();
            }
            if (checkId(id) == null) {
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                products.add(new Product(id, name, price));
            } else {
                System.out.println("Product with this index already exists.");
                addingAProduct();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter correct date: id, name and price.");
            scanner.nextLine();
            addingAProduct();
        }
    }

    private Product checkId(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void removeProductById() {
        System.out.println("Enter the ID of the product you want to remove:");
        if (checkEmptyList()) {
            return;
        }
        try {
            int id = scanner.nextInt();
            for (Product product : products) {
                int productID = product.getId();
                if (productID == id) {
                    products.remove(product);
                    return;
                }
            }
            System.out.println("The product with the specified index is not in the list.");
        } catch (InputMismatchException e) {
            System.out.println("ID must be a number.");
            scanner.nextLine();
            removeProductById();
        }
    }

    public void productEditing() {
        if (checkEmptyList()) {
            return;
        }
        System.out.println("Enter the id, name and price of the product you want to edit.");
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            while (id < 1) {
                System.out.println("ID must be greater then zero");
                System.out.print("ID: ");
                id = scanner.nextInt();
            }

            Map<Integer, Product> productMap = new HashMap<>();
            for (Product product : products) {
                productMap.put(product.getId(), product);
            }

            Map.Entry<Integer, Product> editProduct;
            if ((editProduct = checkIdForEditor(productMap, id)) != null) {
                scanner.nextLine();
                System.out.print("New name: ");
                editProduct.getValue().setName(scanner.nextLine());
                System.out.print("New price: ");
                editProduct.getValue().setPrice(scanner.nextDouble());

            } else {
                System.out.println("Product with this index is not in the list.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter correct date: id, name and price.");
            scanner.nextLine();
            productEditing();
        }

    }

    private Map.Entry<Integer, Product> checkIdForEditor(Map<Integer, Product> productMap, int id) {
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            if (id == entry.getKey()) {
                return entry;
            }
        }
        return null;
    }

    private void sortProducts(List<Product> list) {
        Collections.sort(list);
    }

    public void outputByPriceAscending() {
        List<Product> copyProducts = new ArrayList<>(products);
        sortProducts(copyProducts);
        for (Product product : copyProducts) {
            System.out.println(product);
            System.out.println("------------");
        }
    }

    public void outputByPriceDescending() {
        List<Product> copyProducts = new ArrayList<>(products);
        sortProducts(copyProducts);
        for (int i = copyProducts.size() - 1; i >= 0; i--) {
            System.out.println(copyProducts.get(i));
            System.out.println("------------");
        }
    }

    public void outputByOccurrenceOrder() {
        Queue<Product> queue = new LinkedList<>(products);
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(queue.remove());
            System.out.println("------------");
        }
    }

    public boolean checkEmptyList() {
        if (products.size() == 0) {
            System.out.println("\nList is empty. \n");
            return true;
        }
        return false;
    }

    public void writeProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Products.txt"))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
