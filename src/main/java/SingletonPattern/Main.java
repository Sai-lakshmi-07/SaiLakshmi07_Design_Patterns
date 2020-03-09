package SingletonPattern;

public class Main {
    public static void main(String[] args)
    {
        Singleton a=Singleton.getInstance();
        Singleton b=Singleton.getInstance();
        System.out.println("String from a : "+a.str);
        System.out.println("String from b : "+b.str);

    }
}
