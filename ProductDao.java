import java.util.Scanner;

public class ProductDao {

    /**
     * creates a Product object at the next vacant index
     * ID is selected automatically to ensure there is no duplicate ID
     * @param products array of Products
     */
    public void create(Product[] products) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        for (int i = 0; i < products.length; i++)
            if (products[i] == null) {
                product.setId(i);
                System.out.println("Please enter product name");
                product.setName(sc.nextLine());
                System.out.println("Please enter product price");
                product.setPrice(sc.nextDouble());
                sc.nextLine();
                products[i] = product;
                System.out.printf("Product #" + product.getId() + " successfully created with name " +
                        product.getName() + " and $%.2f.\n", product.getPrice());
                return;
            }
        System.out.println("Products is full. Please delete an entry first");

    }

    /**
     * prints ID, name, and price of all products
     * price is formatted to 2 decimal places
     * @param products array of Products
     */
    public void read(Product[] products) {
        for (Product product : products)
            if (product != null)
                System.out.println(product.toString());
    }

    /**
     * changes name and price of ID selected
     * @param products array of products
     * @param id ID to update Product
     */
    public void update(Product[] products, int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter new product name");
        products[id].setName(sc.nextLine());
        System.out.println("Please enter new product price");
        products[id].setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.printf("Product #" + id + " successfully updated with new name " + products[id].getName() +
                " and $%.2f.\n",  products[id].getPrice());
    }

    /**
     * sets product of specified ID to null
     * @param products array of Products
     * @param id ID to delete Product
     */
    public void delete(Product[] products, int id) {
        System.out.println("Successfully deleted product #" + id);
        products[id] = null;
    }
}
