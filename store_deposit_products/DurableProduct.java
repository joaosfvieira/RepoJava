import java.util.Date;

public class DurableProduct extends Product {
    private int durability;

    public DurableProduct(String name, double price, String brand, String desc, int durability){
        this.setName(name);
        this.setPrice(price);
        this.setBrand(brand);
        this.setDesc(desc);
        Date date = new Date();
        this.setManufacDate(date);
        this.durability = durability;
    }

    public int getDurability() {
        return this.durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
