public class Circle extends Point  {

    private double radius;

    public Circle(){
setRadius(0);
    }

    public Circle(double circleRadius, int xCoordinate, int yCoordinate){
super(xCoordinate,yCoordinate);
setRadius(circleRadius);

    }
    //set 
public void setRadius(double circleRadius){
    this.radius = ( circleRadius >= 0 ? circleRadius : 0);
}
public double getRadius() {
    return radius;
}
@Override
public String toString() {
    
    return String.format( "Center = %s; Radius = %f",
    super.toString(), radius );
}

@Override
public double area() {
double area;
area = getRadius() *getRadius() * Math.PI;

    return area;
}


@Override
public String getName() {
    return "Circle";
}

}
