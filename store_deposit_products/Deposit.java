import java.util.ArrayList;

public class Deposit {
    private ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    //Add product to the deposit
    public void addProduct(Product product){
        System.out.println("Added " + product.getName() + " to the deposit");
        this.products.add(product);
    }

    //Remove product from the deposit
    public void removeProduct(String name){
        for(int i=0; i<this.products.size(); i++){
            if(name == this.products.get(i).getName()){
                System.out.println("Removed " + this.products.get(i).getName() + " from the deposit");
                this.products.remove(i);
            }
        }
    }

    //Returns the number of products in the deposit
    public int numberOfProducts(){
        return this.products.size();
    }

    //Returns true if the deposity is empty, false otherwise
    public boolean isDepositEmpty(){
        return this.products.isEmpty();
    }

    //Returns the name of the most expensive product in the deposit
    public Product mostExpensive(){
        Product aux = new Product();
        if(this.products.isEmpty() == false){
            aux = this.products.get(0);
        }

        for(int i=0; i<this.products.size(); i++){
            if(this.products.get(i).getPrice() > aux.getPrice()){
                aux = this.products.get(i);
            }
        }

        return aux;
    }
}
