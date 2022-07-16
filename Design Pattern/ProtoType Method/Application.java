public class Application {
    public static void main(String[] args) {

        Registry registry = new Registry();
        Dog dog = (Dog) registry.getAnimal(AnimalType.DOG);
        System.out.println(dog);

        dog.setBreed("French Bulldog");
        System.out.println(dog);

        Parrot parrot = (Parrot) registry.getAnimal(AnimalType.PARROT);
        System.out.println(parrot);
    }
}
