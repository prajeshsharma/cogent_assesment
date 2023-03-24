import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[10];
        ProductDao dao = new ProductDao();
        int choice;
        do {
            System.out.println("******MENU*******\nEnter a number");
            System.out.println("1-Create");
            System.out.println("2-Read");
            System.out.println("3-Update");
            System.out.println("4-Delete");
            System.out.println("5-exit");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) // create
                dao.create(products);
            else if (choice == 2) // read
                dao.read(products);
            else if (choice == 3) { // update
                System.out.println("Enter ID of product you wish to update");
                int id = sc.nextInt();
                sc.nextLine();
                if (id < 0 || id > 9 || products[id] == null)
                    System.out.println("Product #" + id + " does not exist.");
                else
                    dao.update(products, id);
            } else if (choice == 4) { // delete
                System.out.println("Enter ID of product you wish to delete");
                int id = sc.nextInt();
                sc.nextLine();
                if (id < 0 || id > 9 || products[id] == null)
                    System.out.println("Product #" + id + " does not exist.");
                else
                    dao.delete(products, id);
            }
        } while (choice != 5);
        System.out.println("Goodbye!!!");
    }
}
