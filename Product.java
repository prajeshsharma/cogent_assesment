public class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Math.round(100 * price) / 100.00;
    }

    public void setPrice(double price) {
        this.price = Math.round(100 * price) / 100.00;
    }

    @Override
    public String toString() {
        return "Product ID: #" + id + ", name: " + name +  ", price: $" + String.format("%.2f", price);
    }
}
