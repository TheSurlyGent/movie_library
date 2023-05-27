
import java.util.Scanner;

public class Task1 {
    
     public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        
        System.out.println("Enter 3 digit ID number");
        int id = a.nextInt();
        System.out.println("Enter Title");
        String title = b.nextLine();
        System.out.println("Enter Rating");
        String Rating = b.nextLine();
        System.out.println("Enter Genre");
        String Genre = b.nextLine();   
        
        Movie e1 = new Action(id,title,Rating,Genre);
            e1.displayInfo();
        
        Movie e2 = new Comedy(444,"Big Mama","R","C");
            e2.displayInfo();
        
            if (e1.id == e2.id){
               System.out.println("These are the same movies");
        }
            else{
                System.out.println("Different Movies");
            }
        System.out.println(e1.calculateFees(10));
        System.out.println(e2.calculateFees(10));
        
        }
        
        
        
        
        
        
    }
    

