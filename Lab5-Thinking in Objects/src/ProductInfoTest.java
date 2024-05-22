import java.util.Scanner;
public class ProductInfoTest {
    public static void main(String[] args) {
String productT;
int year;
String fname;
String lname;


        Scanner sc = new Scanner(System.in);
        System.out.println("the total number of Products: 0");
Product C1 = new Product("Smartphone", "John", "Doe", 2021);


        System.out.println("#####################################");
        System.out.println("Enter product title: ");
productT = sc.nextLine();
System.out.println("Enter first and last name of the Customer: ");
fname = sc.next();

lname = sc.nextLine();


System.out.println("Enter year: ");
year = sc.nextInt();

Product C2 = new Product(productT, fname, lname, year);
Person P1 = new Person("Jane","Smith");
Product C3 = new Product("Laptop", P1, 2022);
System.out.println("##########Productss information##########");
System.out.println(C1.toString());
System.out.println(C2.toString());
System.out.println(C3.toString());
System.out.println("#####################################");
System.out.println("the total number of products: "+ C3.getCount());
}
}
