import java.util.Scanner; 
import java.util.ArrayList;

import java.util.Scanner; 
import java.util.ArrayList;

public class TMRunner {
	public static void main(String[] args)
    {
	      Scanner input = new Scanner(System.in);
	      boolean stop = false;
	      ArrayList<Task> arr = new ArrayList<>();
	      
	      System.out.println("Reminders:");
	      System.out.println(" -Input '+' to add an assignment.");
	      System.out.println(" -Input '-' to remove an assignment.");
	      System.out.println(" -Input '*' to quit.");
	      
	      System.out.println("Welcome to your task manager! To get started, add your first assignment! To do so, input '+'");
	        while(stop != true)
	        {

	      // always on screen
	        String action = input.nextLine();

	      //if user inputs "+"
	        if(action.equals("+"))
	          {
	            System.out.println("Enter the assignment name:");
	            String name = input.nextLine();
	          
	            System.out.println("Enter the number of the month it's due: ");
	            int month = input.nextInt();

	            System.out.println("Enter the number of the day it's due: ");
	            int day = input.nextInt();

	            System.out.println("How much anxiety is it giving you? (0 - 10)");
	            int anxiety = input.nextInt();
	            int difficultyLevel = 0;
	          
	            Task t = new Task(month, day, name, anxiety, difficultyLevel);
	            arr.add(t);
	            System.out.println("Adding your assignment...");
	          }
	      

	        else if(action.equals("-"))
	          {
	        
	            if(arr.size() > 0)
	            {
	            System.out.println("Enter the number of the assignment number you would like to remove: ");
	            int taskToRemove = input.nextInt();
	            arr.remove(taskToRemove - 1);
	            System.out.println("Removing your assignment...");  
	            }

	            else
	            System.out.println("You have no assignments to remove!");  
	          }

	        else if(action.equals("*") & arr.size() > 0)
	          {
	            System.out.println("Generating your sorted to-do list...");
	            
	            MergeSort newArr = new MergeSort(arr);
	            newArr.sortGivenArray();
	            // Print Sorted Array
	            System.out.println();
	            for (int i = 0; i < newArr.getSortedArray().size(); i++)
	            {
	            	System.out.println((i+1) + ". " + newArr.getSortedArray().get(newArr.getSortedArray().size() - i - 1).toString());
	                System.out.println();
	            }
	            
	            
	            stop = true;
	          }

	        else
	        {
	         System.out.println("Please enter either '+' to add an assignment or '-' to remove an assignment");
	        }

		
		
 /*       System.out.print("Unsorted: ");
        
        System.out.println("");
        for(Task n : arr)
        {
            System.out.print(n + " ");
        }
        System.out.println("");
*/
        
	}
 }
	        
}