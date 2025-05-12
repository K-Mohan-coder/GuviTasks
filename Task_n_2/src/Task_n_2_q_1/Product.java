package Task_n_2_q_1;

public class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost for a single product
    public double getTotalCost() {
    	System.out.println("PId" + pid+"\nPrice : "+price+"\nquantity : "+quantity+"\n**********");
        return price * quantity;
    }
}
