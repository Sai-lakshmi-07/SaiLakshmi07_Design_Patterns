package SingletonPattern;

public class Singleton {
    private static Singleton instance=null;
    public String str;
    private Singleton()
    {
        str="I am a String";
    }
    public static Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}
