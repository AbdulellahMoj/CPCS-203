import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
   
   public static void main(String[] args) {
    Tasks task;
    String DueDate;
    int Status;
    String taskTittle;
Scanner sc=new Scanner(System.in);

ArrayList<Tasks> ToDoList = new ArrayList<>();

String key = "Y";

do{

    System.out.print("Enter the Tittle of the Task: ");
    taskTittle = sc.nextLine();
    System.out.print("Enter the Task Due Date: ");
    DueDate = sc.nextLine();
    System.out.println("Enter the Status: ");
    Status = sc.nextInt();
sc.nextLine();

task = new Tasks(taskTittle, DueDate, Status);
ToDoList.add(task);

System.out.println("Continue adding (y/n)?");
key = sc.nextLine();


}while(key.equalsIgnoreCase("Y"));

System.out.println();
System.out.println("To do List Contains\n------------------------------------------------------------------");
for(Tasks T: ToDoList){
   System.out.println( T.toString());
}
   }
}
