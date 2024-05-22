import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder build = new StringBuilder();


        System.out.println("Product ID Generator: \n --------------------- ");

        System.out.println("Please Enter Produc Information");



// -------------------------------------------------------------------------------------------------------------------------------------------
            //
            String product_cat;
            //
        while (true) {
            System.out.print("Product Category (only letters with a length more than 2):");
            product_cat = sc.next();
            ///
            if (product_cat.length() > 2) {
                if (checkUser(product_cat)) {
                    build.append(product_cat);
                    break;
                } else {
                    System.out.println("Product Category must only letters ");
                    continue;

                }///
            } else {
                System.out.println("Product Category length was not more than 2, Please try again");
                continue;

            }///

        }
        System.out.println("hi");

    


// -------------------------------------------------------------------------------------------------------------------------------------------
        
                //
                String product_code;
                //
    while(true){
        System.out.print("Product Code (consist only of 3 digits):");
        product_code = sc.next();
        if(product_code.length() == 3){
            build.append("-" + product_code);
            break;
    }
        System.out.println("Product Code length was not 3 , Please try again");
}
    
// -------------------------------------------------------------------------------------------------------------------------------------------
            //
            int year;
            //
System.out.print("Manufacturing Year: ");
year = sc.nextInt();
build.append("-"+ year);
//---------------------------------------------------------------------------------------------------------------------------------------------

            //
            int srn;
            //
System.out.print("Stock Reference Number: ");
srn = sc.nextInt();
build.append("-"+ srn);

//--------------------------------------------------------------------------------------------------------------------------------------------

System.out.println();

System.out.println("-------------------------");

System.out.print("Generated Course ID: " + build);

}
// -------------------------------------------------------------------------------------------------------------------------------------------
 
    public static boolean checkUser(String x) {
        char letter;
        boolean flag = true;

        for (int i = 0; i < x.length(); i++) {
            letter = x.charAt(i);

            if (!(letter >= 'A' && letter <= 'Z') && !(letter >= 'a' && letter <= 'z')) {
                flag = false;
                break;
            }

        }
        return flag;

    }
}
