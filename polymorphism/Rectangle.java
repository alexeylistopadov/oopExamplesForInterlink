package polymorphism;

public class Rectangle extends Shape {

    private double a,b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double findArea() {
        return a*b;
    }
}
