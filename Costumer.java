import java.util.Arrays;

public class Costumer {
    private String name;
     Passport passport;
     Product[] products;
     Bank bank;

    public Costumer(String name, Passport passport, Product[] products, Bank bank) {
        this.name = name;
        this.passport = passport;
        this.products = products;
        this.bank = bank;
    }

    public  String getAllCostumerProducts(String name){
        for (int i = 0; i < products.length ; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println(getName());
                return getName();
            }
        }
        return null;
    }
    public Product[] deleteProductByName(String name, String productName) {
        int indexToRemove = -1;
        for (int i = 0; i < products.length; i++) {

            if (products[i].getName().equals(productName) && products[i].getName().equals(name)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Product[] arr = new Product[products.length - 1];
            int j = 0;
            for (int i = 0; i < products.length; i++) {
                if (i != indexToRemove) {
                    arr[j] = products[i];
                    j++;
                    System.out.println(products[i]);
                }
            }
            products = arr;
            products = Arrays.copyOf(arr, arr.length - 1);
        }
        return products;
    }
    public Product[] addProduct(Product productName) {
        for (Product pp : products) {
            if (!pp.equals(productName)) {
                Product[] ppp = new Product[products.length + 1];
                for (int i = 0; i < products.length; i++) {
                    ppp[i] = products[i];
                }
                ppp[products.length] = productName;
                products = Arrays.copyOf(ppp, ppp.length);
                return products;
            }
        }
        return null;
    }

    public void updateCustomerName(String newName) {
        this.name = newName;
    }

    public String payment(String name,String password, int sum) {
        if (bank.getPassword().equals(password)) {
            if (bank.getTotalMoney() >= sum) {
                bank.setTotalMoney(bank.getTotalMoney() - sum);
                return "Payment successful.";
            } else {
                return "Insufficient funds.";
            }
        } else {
            return "Incorrect password.";
        }
    }

    public void credit(String password, int sum) {
        if (bank.getPassword().equals(password)) {
            bank.setTotalMoney(bank.getTotalMoney() + sum);
            System.out.println("Credited " + sum + " to your account.");
        } else {
            System.out.println("Incorrect password.");
        }
    }

    public String checkProduct() {
        for (Product product : products) {
            if (product.getIsAlcoholic().equalsIgnoreCase("True")) {
                return "Alcohol product found.";
            }
        }
        return "No alcohol product found.";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", passport=" + passport +
                ", products=" + Arrays.toString(products) +
                ", bank=" + bank +
                '}';
    }
}
