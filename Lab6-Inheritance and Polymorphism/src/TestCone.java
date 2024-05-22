import java.util.*;
public class TestCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("***Cone***\r\n" + //
        "--------------\r\n" + //
        "Please, enter the Cone's base radius:");
double R = sc.nextDouble();
System.out.println("--------------\r\n" + //
        "Please, enter the cone's height:");
double H = sc.nextDouble();
Cone cone1 = new Cone(R, H);
System.out.println("--------------\r\n" + //
        "Cone information:");
        System.out.println(cone1.toString()
        );
    }
}
