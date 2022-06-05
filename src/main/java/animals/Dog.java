package animals;

public class Dog extends Animal {
    @Override
    public String getVoice() {
        return "I am dog";
    }

    public Dog(String breed, String name, int age, double weight, double height) {
        super(breed, name, age, weight, height);
    }


}
