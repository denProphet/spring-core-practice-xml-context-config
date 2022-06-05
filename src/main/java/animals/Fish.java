package animals;

import elements.Fin;

public class Fish extends Animal {

    private Fin fin;

    public Fish(String breed, String name, int age, double weight, double height, Fin fin) {
        super(breed, name, age, weight, height);
        this.fin = fin;
    }

    @Override
    public String getVoice() {
        return "I am fish";
    }

    public Fin getFin() {
        return fin;
    }

    public void setFin(Fin fin) {
        this.fin = fin;
    }
}
