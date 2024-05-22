/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 
 */
public class DailyBookReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number =0;
        String Bname;
        double Pcost;
        double income;
        String type;

       Scanner sc = new Scanner(System.in);
System.out.println("Enter number of Books for the current day:");
 number = sc.nextInt();
Book [] ArrayofBooks = new Book[number];
System.out.println("--------------------------------------------------------------------");

for( int i =0; i< number; i++){
   sc.nextLine();
System.out.println("Enter Book's Tittle:");
         Bname = sc.nextLine();
        System.out.println("Enter Book's Purchases Cost:");
         Pcost = sc.nextDouble();
System.out.println("Enter book's type (C for Children, M for Motivational and B for Biographies ):");
 type = sc.next();

System.out.println("--------------------------------------------------------------------");

if (type.equalsIgnoreCase("C")) {
    Children book = new Children(Bname, Pcost);
    ArrayofBooks[i] = book;
}
else if (type.equalsIgnoreCase("M")) {
    Motivational book = new Motivational(Bname, Pcost);
    ArrayofBooks[i] = book;
}
else if (type.equalsIgnoreCase("B")){
    Biographies book = new Biographies(Bname, Pcost);
    ArrayofBooks[i] = book;
}


}
 income = 0;

 for (int i = 0; i < ArrayofBooks.length; i++) {

     if (ArrayofBooks[i] instanceof Children) {

         Children children = (Children) ArrayofBooks[i];
         System.out.print("Children ");
         System.out.println(children.toString());
         income += children.getPurchasesCost();

     } else if (ArrayofBooks[i] instanceof Motivational) {

         Motivational motivational = (Motivational) ArrayofBooks[i];
         System.out.print("Motivational ");

         System.out.println(motivational.toString());
         income += motivational.getPurchasesCost();

     } else if (ArrayofBooks[i] instanceof Biographies) {

         Biographies biographies = (Biographies) ArrayofBooks[i];
         System.out.print("Biographies ");

         System.out.println(biographies.toString());

         income += biographies.getPurchasesCost();

     }

 }

 System.out.println("--------------------------------------------------------------------");

 System.out.println("Current day income = " + income + "SR.");

 System.out.println("--------------------------------------------------------------------");

}

}


