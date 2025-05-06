package PBO;

abstract class Shape {
    protected String color;
    public Shape (String color){
        this.color = color;
    }
    public abstract double getArea();
}

class Triangle extends Shape {
    private final double base;
    private final double height;
    public Triangle (String color, double base, double height){
        super (color);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    private final double radius;
    public Circle (String Color, double radius){
        super(Color);
        this.radius = radius;
    }
    @Override
    public double getArea (){
       return Math.PI * radius * radius; 
    }
}
        

public class TugasMinggu06 {
    public static void main(String[] args) {
        Shape segitiga = new Triangle ("Hijau", 10,5);
        Shape lingkaran = new Circle ("Ungu", 100);
        System.out.println("Luas segitiga berwarna "
                +segitiga.color+": "+segitiga.getArea());
        System.out.println("Luas ;ingkaran berwarna "
                +lingkaran.color+": "+lingkaran.getArea());
    }
}
