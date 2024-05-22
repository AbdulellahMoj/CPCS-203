public class Product {
    private String productName;
    private Person Customer; 
    private int manufacturingYear; 
    private static int count = 0;

    public Product(String productName, String fName, String lName ,int manufacturingYear) {
        this.Customer = new Person(fName,lName);
this.productName = productName;
this.manufacturingYear = manufacturingYear;
count += 1;
    }

    public Product(String productName, Person Customer,int manufacturingYear) {
        this(productName,Customer.getFname(),Customer.getLname(), manufacturingYear);
    }
//set methods
public void setProductName(String productName){
    this.productName = productName;
}
public void setManufacturingYear(int manufacturingYear){
    this.manufacturingYear = manufacturingYear;
}

public void setCustomer(Person Customer){
    this.Customer = Customer;
}

//get methods
public String getProductName(){
    return this.productName;
}

public int getManufacturingYear(){
    return this.manufacturingYear;
}

public Person getCustomer(){
    return this.Customer;
}

//methods ------

public String toString(){
    String S= getProductName() + ", " + Customer.toString() + ", " + getManufacturingYear() ;
    return S;
}

public static int getCount(){
    return count;
}

}
