public class Dog extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "caste='" + breed + '\'' +
                '}';
    }
}
