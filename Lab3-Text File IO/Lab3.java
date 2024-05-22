
// import the necessary libraries
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Lab3 {
    public static void main(String [ ]args) throws Exception{
        // file 1 and file 2 objects creation
        File file1 = new File("C:\\Users\\abdul\\Desktop\\CPCS203\\LAB s\\new s\\Lab3\\file1.txt");
        File file2 = new File("C:\\Users\\abdul\\Desktop\\CPCS203\\LAB s\\new s\\Lab3\\file2.txt");
// check if the files exist
        if(!file1.exists()){
            System.out.println("File 1 does not exist");
            System.exit(0);
        }
        if(!file2.exists()){
            System.out.println("File 2 does not exist");
            System.exit(0);
        }
        // create a new scanner object
Scanner sc1 = new Scanner(file1);
Scanner sc2 = new Scanner(file2);
// create a new file and printWriter object
File outFile = new File("C:\\Users\\abdul\\Desktop\\CPCS203\\LAB s\\new s\\Lab3\\outFile.txt");
PrintWriter pw = new PrintWriter(outFile);
System.out.println(outFile.getAbsolutePath());

;
//Array of the occurence of every character in the file
int [] charCount = new int[26];
//Array of the alphabets
char [] alphabets = new char[26];
//initialize the alphabets array
for(int i = 0; i < 26; i++){
    alphabets[i] = (char)(i + 65);
}
while (sc1.hasNext() || sc2.hasNext()) {
// read the first and last name from the files
            String fname = sc1.nextLine();
            String lname = sc2.nextLine();

// concatenate the first and last name
String FullName = fname + " " + lname; 
String FullName_NoSpace = fname + lname;

// write the full name to the output file
pw.println(FullName);

// count the occurence of each character

for(int i = 0; i < FullName_NoSpace.length(); i++){
    char c = FullName_NoSpace.charAt(i);
char letter = Character.toUpperCase(c);

   //add the occurence of each character to the array
            charCount[letter - 'A']++;

        }
 
        
        
    }



// print the occurence of each character
for(int i = 0; i < alphabets.length; i++){
    System.out.println("Number of "+alphabets[i]+ "'s: " + charCount[i]);
    }


// close the scanner and printWriter objects
sc1.close();
sc2.close();
pw.close();
pw.flush();    
}

}