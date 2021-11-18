import java.util.Date;

public class Product{
    private String name;
    private double price;
    private String brand;
    private String desc;
    private Date manufacDate;

    public Product(){
        this.name = "";
        this.price = 0;
        this.brand = "";
        this.desc = "";
        Date date = new Date();
        this.manufacDate = date;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getManufacDate() {
        return this.manufacDate;
    }

    public void setManufacDate(Date manufacDate) {
        this.manufacDate = manufacDate;
    }
}
