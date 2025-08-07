package OOP;

public class BusinessTrip {
    public final int rub = 25;
   String name;

   public int many;

   public int days;

   public int coast() {
       return (int)(many+days*rub);
   }

   public void show() {
       System.out.println("Суточные = "+rub);
       System.out.println("Фамилия Имя = "+name);
       System.out.println("Транспортные расходы = "+many);
       System.out.println("Количество дней = "+days);
       System.out.println("Итого расходы = "+coast());
   }
}
