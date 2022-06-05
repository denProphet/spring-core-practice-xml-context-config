package animals;

import elements.Wing;

public class Bird extends Animal {
    private Wing wing;

    public Bird(String breed, String name, int age, double weight, double height, Wing wing) {
        super(breed, name, age, weight, height);
        this.wing = wing;
    }

    public Bird(){}

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    @Override
    public String getVoice() {
        return "I am bird";
    }

    public static void myInit(){
        System.out.println("Bird init");
    }

    public static void myDestroy(){
        System.out.println("Bird destroy");
    }



}
