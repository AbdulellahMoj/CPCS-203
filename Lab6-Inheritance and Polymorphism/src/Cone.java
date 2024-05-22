public class Cone extends Circle {

    private double hieght = 1.0;

    public Cone(){

    }
    public Cone(double radius,double hieght){
        super(radius);
        this.hieght= hieght;
    }
    public Cone(double radius,double hieght, String color){
        super(radius,color);
        this.hieght= hieght;
    }

    public double getHieght() {
        return this.hieght;
    }
    public void setHieght(double hieght) {
        this.hieght = hieght;
    }
double R = getRadius();
double A = getArea();

    
    public double getVolume() {
    System.out.println(A);
Double Volume= ( (A * getHieght())* 1/3);
        return Volume;
    }
    public double getAreaC(){
        double Area = A + (Math.PI * R *  Math.sqrt(R * R + getHieght() * getHieght()));
        return Area; 
    }
    @Override
    public String toString() {
String s = "base radius=" + getRadius() +" color=" + getColor()+ " height="+ getHieght() + " Volume: " + getVolume() + " Surface Area: " + getAreaC();
        return s;
    }

}
