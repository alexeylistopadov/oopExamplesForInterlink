package polymorphism;

public class Triangle extends Shape {

    private double a,b,c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double findArea() {
        double p = (a + b + c)/2 ;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}
