package AdapterPattern;

public class Lion implements Animal{

    // a concrete implementation of bird
    public void hunts()
    {
        System.out.println("Lions Hunt");
    }
    public void makeSounds()
    {
        System.out.println("Roars");
    }
}