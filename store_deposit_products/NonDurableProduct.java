import java.util.Date;

public class NonDurableProduct extends Product{
    private String gender;
    private Date expDate;

    public NonDurableProduct(String name, double price, String brand, String desc, String gender){
        this.setName(name);
        this.setPrice(price);
        this.setBrand(brand);
        this.setDesc(desc);
        Date date = new Date();
        this.setManufacDate(date);
        this.gender = gender;
        this.expDate = date;
    }
    public NonDurableProduct(){
        this.gender = "";
        Date date = new Date();
        this.expDate = date;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getExpDate() {
        return this.expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
