package FacadePattern;

public class Main {
    public static void main(String[] args)
    {
        Veg v=new Veg();
        v.getMenu();
        NonVeg nv=new NonVeg();
        nv.getMenu();
        BothVegnonveg both=new BothVegnonveg();
        both.getMenu();
    }
}
