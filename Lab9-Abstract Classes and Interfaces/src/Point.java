public class Point implements Shape {
    private int x;
    private int y;
    

    public Point(){
    setPoint(0,0);
    }
    public Point(int xCoordinate,int yCoordinate){
setPoint(xCoordinate,yCoordinate);
    }
//methodes

public void setPoint(int  xCoordinate,int yCoordinate){
    this.x = xCoordinate;
this.y= yCoordinate;
}

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

public double area(){
double area = 0.0;
    return area;
}

public double volume(){
    double volume = 0.0;
    return volume;
}
@Override
public String getName() {
    return "Point";
}

    @Override
    public String toString() {
        return  String.format("[%d, %d]", x, y);
    }



}
