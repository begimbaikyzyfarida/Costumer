import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Passport passport = new Passport("21.09.2009","Kyrgyzstan","male");
        Passport passport1 = new Passport("21.07.2021","Kazakstan","male");
        Passport passport2 = new Passport("21.09.1998","USA","male");



        Bank bank = new Bank("Farida","2123",230000000);
        Bank bank1 = new Bank ("Azamat","678987",2100000);
        Bank bank2 = new Bank ("Samara", "546789",5600000);


        Product product = new Product("Shoro","Drink", 90,5, LocalDate.of(2023,4,10),"False");
        Product product1 = new Product("Shaurma","Food",180,3,LocalDate.of(2023,8,15),"False");
        Product product2 = new Product("Belaya Reka","Drink",80,2,LocalDate.of(2022,5,17),"True");
        Product product3 = new Product("Burger","Food",170,6,LocalDate.of(2023,7,23),"False");
        Product product4 = new Product("Konyak","Drink",345,9,LocalDate.of(2021,9,22),"True");
        Product product5 = new Product("Manty","Food",450,10,LocalDate.of(2023,9,1),"False");

        Product [] products ={ product,product1};
        Product [] products1 = { product2,product3};
        Product [] products2 = {product4};

        Costumer costumer = new Costumer("Bekzat",passport,products,bank);
        Costumer costumer1 = new Costumer("Alihan",passport1,products1,bank1);
        Costumer costumer2 = new Costumer("Adahan",passport2,products2,bank2);

        System.out.println("----------------------------------------------------------");
        System.out.println(Arrays.toString(costumer2.addProduct(product5)));
        System.out.println("----------------------------------------------------------");
        costumer.getAllCostumerProducts("Shoro");
        System.out.println("----------------------------------------------------------");
        costumer1.deleteProductByName("Burger", "Burger");
        System.out.println("----------------------------------------------------------");
        costumer.updateCustomerName("Bekzat Begimbai uulu");
        System.out.println("Updated customer name: " + costumer.getName());
        System.out.println("----------------------------------------------------------");
        String paymentResult = costumer2.payment("Adahan", "546789",788900);
        System.out.println("Payment result: " + paymentResult);
        costumer2.credit("546789", 5000340);
        System.out.println("----------------------------------------------------------");
        String alcoholCheckResult = costumer2.checkProduct();
        System.out.println("Alcohol product check result: " + alcoholCheckResult);
        System.out.println("----------------------------------------------------------");
        System.out.println(costumer);

    }
}
