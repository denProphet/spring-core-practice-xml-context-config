package elements;

public class Fin {
    private double length;

    private Fin(double length) {
        this.length = length;
    }

    public static Fin factory(double length){
        return new Fin(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
