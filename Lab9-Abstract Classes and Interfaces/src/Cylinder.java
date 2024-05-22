public class Cylinder extends Circle {
private double height;

public Cylinder(){
setHeight(0);
}
public Cylinder(double cylinderHeight, double cylinderRadius, int xCoordinate,int yCoordinate){
    super(cylinderRadius, xCoordinate, yCoordinate);
    setHeight(cylinderHeight);
}

public void setHeight(double height) {
    this.height = (height>= 0 ? height: 0);
}
public double getHeight() {
    return height;
}
@Override
public double area() {
    return 2* super.area() + 2 * Math.PI * getRadius() *getHeight();
}
@Override
public double volume() {
    return super.area() * getHeight();
}
@Override
public String toString() {
    return String.format("%s; Height = %f",super.toString(), getHeight());
}
@Override
public String getName() {
    return "Cylinder";
}
    
}
