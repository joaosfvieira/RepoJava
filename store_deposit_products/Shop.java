

public class Shop {
    private Product product = new Product();

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static void main(String[] args){
        DurableProduct car = new DurableProduct("car", 32000.00, "mercedes", "a_brand_new_car", 15);
        DurableProduct book = new DurableProduct("book", 45.00, "leitura", "book_on_algorithms", 30);
        DurableProduct smartphone = new DurableProduct("smartphone", 1500.00, "iphone", "the_new_iphone", 2);
        NonDurableProduct chocolat = new NonDurableProduct("chocolat", 11.00, "toblerone", "hmm_yummy", "food");
        NonDurableProduct towel = new NonDurableProduct("towel", 8.50, "dunno", "use_after_you_shower_xd", "bathroom");
        NonDurableProduct soap = new NonDurableProduct("soap", 1.75, "alsodunno", "this_one_while_you_shower_xP", "bathroom");

        Deposit deposit = new Deposit();
        
        deposit.addProduct(car);
        deposit.addProduct(book);
        deposit.addProduct(smartphone);
        deposit.addProduct(chocolat);
        deposit.addProduct(towel);
        deposit.addProduct(soap);

        deposit.removeProduct("smartphone");
        deposit.removeProduct("towel");
        
        System.out.println(deposit.numberOfProducts());
        System.out.println(deposit.isDepositEmpty());
        System.out.println(deposit.mostExpensive().getName());

        deposit.removeProduct("car");
    }
}
