package OOP;

public class Purchase {

    Commodity commodity;
    int kol;

    String nam;

    private int getCost() {
        return commodity.price*kol;
    }
    public void show() {
        commodity.show();
        System.out.println("Количество: "+kol);
        System.out.println("Стоимость покупки: "+getCost());
    }
}
