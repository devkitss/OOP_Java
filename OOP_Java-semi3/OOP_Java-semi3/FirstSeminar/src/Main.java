public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Продукт #1";
        product1.brand = "Производитель #1";
        product1.price = 200;
        System.out.println(product1.displayInfo());
    }
}
