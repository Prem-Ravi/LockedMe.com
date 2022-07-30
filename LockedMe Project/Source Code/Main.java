package VirtualKeyforYourRepositories;

import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {

int ch=0, choice=0;
Scanner sc =new Scanner(System.in);

System.out.println("*****************************************************");
System.out.println("\t\t LockedMe.com ");
System.out.println("*****************************************************\n");
System.out.println("\tDeveloper\t: Prem Ravi \n \tCompany \t: Lockers Pvt. Ltd. \n \tProduct \t: SL Phase 1 Project \n");
System.out.println("*****************************************************\n");

while(true)
{
System.out.println("Features: \n");
System.out.println("1. Retrive Files");
System.out.println("2. Business Operations");
System.out.println("3. Close Application\n");
System.out.println("Choose one of the above feature:");


try
{    
ch = sc.nextInt();
}
catch(Exception e)  
            {  
              System.err.println("Sorry! Please type a number between 1 and 3");  
              break;
            }         

switch(ch)
{

case 1: //List function feature to list all files in ascending order.
BusinessOperations.listFiles();
break;
case 2:
boolean flag=true;
while(flag) {

System.out.println("Please choose one of the following options :");
System.out.println("1. Add a File");
System.out.println("2. Delete a File");
System.out.println("3. Search for a File");
System.out.println("4. Navigate to previous Menu options");
try{    
choice = sc.nextInt();
}
catch(Exception e)  
                 {  
             System.err.println("Sorry! Please type a number between 1 and 3"); 
             break;
                 }

switch(choice)
{
case 1:
//Creation of a file takes place
System.out.println("Input the name of a file to be created: ");
String fileCreate = sc.next();

// Calling the function to create the file
BusinessOperations.createFile(fileCreate);
break;


case 2:
//deletion of a file takes place
System.out.print("Input the name of a file to be deleted: ");
String fileDelete = sc.next();

// Calling the function to delete the file
BusinessOperations.deleteFile(fileDelete);
break;
case 3:
//Search for a file takes place
System.out.println("Input the name of a file to be searched: ");
String fileSearch = sc.next();

// Calling the function to search the file
BusinessOperations.searchFile(fileSearch);
break;
case 4:
flag = false;
break;

default:
//In the case of unprecedented input execute this
System.err.println("\n Opps! Invalid Input,Re-do the process\n");
break;
}
}

break;

case 3:

//Voluntarily exiting the application
sc.close();
System.out.println("\nIt was nice having you here! See you again. Good bye...");
System.exit(1);
break;

default:
//In the case of unprecedented input execute this
System.err.println("\n\n Opps! Invalid Input, Select within the range of 1-3\n");
break;

}
}

}


}
