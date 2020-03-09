package AdapterPattern;

public class AnimalAdapter implements ToyLion{
        Animal animal;
        public AnimalAdapter(Animal animal)
        {
            this.animal = animal;
        }

        public void peep()
        {
            animal.makeSounds();
        }
}

