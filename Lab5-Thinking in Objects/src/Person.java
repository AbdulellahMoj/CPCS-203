public class Person {
        private String fName;
        private String lName;

        public Person(String fname, String lname ){
            this.fName = fname;
            this.lName = lname;
        }


        //set methods 
        public void setFname(String fName ){
            this.fName = fName;
        }

        public void setLname(String lName){
            this.lName = lName;
        }
    
//get methods

public String getFname(){
    return this.fName;
}

public String getLname(){
    return this.lName;
}

//to string
public String toString(){
    
    String FullName = getFname() +" " + getLname(); 
    return FullName;
}

    }
