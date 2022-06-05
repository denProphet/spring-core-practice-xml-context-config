package animals;

public abstract class Animal {

    private String breed;
    private String name;
    private int age;
    private double weight;
    private double height;

    public Animal(String breed, String name, int age, double weight, double height) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Animal() {
    }

    public abstract String getVoice();

    @Override
    public String toString() {
        return "animals.Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
