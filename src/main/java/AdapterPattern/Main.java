package AdapterPattern;

public class Main
{
    public static void main(String args[])
    {
        Lion lion = new Lion();
        ToyLion toyLion = new PlasticToyLion();
        // Wrap a animal in a animalAdapter so that it behaves like toy lion
        ToyLion animalAdapter = new AnimalAdapter(lion);
        System.out.print("Lion..");
        lion.hunts();
        lion.makeSounds();
        System.out.print("ToyLion...");
        toyLion.peep();
        // toy lion behaving like a animal
        System.out.print("AnimalAdapter...");
        animalAdapter.peep();
    }
}
