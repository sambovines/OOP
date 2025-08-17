package OOP.Example4;

public class Purchase {

    private Commodity commodity;
    private int quantity;
    public int getCost() {
        return commodity.getPrice() * quantity;
    }


    public Purchase(Commodity commodity, int quantity) {
        this.commodity = commodity;
        this.quantity = quantity;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return commodity.getName() + ";" + commodity.getPrice() + ";" + quantity + ";" + getCost();
    }
}
