import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private int price;
    private int count;
    private LocalDate madeInDate;
    private String isAlcoholic;
    Product[] products;

    public Product(String name, String description, int price, int count, LocalDate madeInDate, String isAlcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
        this.madeInDate = madeInDate;
        this.isAlcoholic = isAlcoholic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getMadeInDate() {
        return madeInDate;
    }

    public void setMadeInDate(LocalDate madeInDate) {
        this.madeInDate = madeInDate;
    }

    public String getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(String isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", madeInDate=" + madeInDate +
                ", isAlcoholic='" + isAlcoholic + '\'' +
                '}';
    }
}
