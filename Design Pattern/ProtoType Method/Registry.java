import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<AnimalType, Animal> animals = new HashMap<>();


    public Registry() {
        this.intialize();
    }

    public Animal getAnimal(AnimalType animalType) {
        Animal animal = null;
        try {
             animal = (Animal) animals.get(animalType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return animal;
    }

    private void intialize() {
        Dog dog = new Dog();
        dog.setType("Mammel");
        dog.setColor("Black");
        dog.setBreed("German Shepherd");

        Parrot parrot = new Parrot();
        parrot.setType("Bird");
        parrot.setColor("Green");
        parrot.setCanTalk(true);

        animals.put(AnimalType.DOG, dog);
        animals.put(AnimalType.PARROT, parrot);
    }
}
