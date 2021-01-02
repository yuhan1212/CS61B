// Java code to illustrate Set.contains() method 
import java.io.*; 
import java.util.*; 
  
public class HashSetDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty Set 
        Set<String> set = new HashSet<String>(); 
        // Set<Integer> set = new HashSet<Integer>(); 
  
        // Using add() method to add elements into the Set 
        set.add("Welcome"); 
        set.add("To"); 
        set.add("Geeks"); 
        set.add("4"); 
        set.add("Geeks"); 
  
        // Displaying the Set 
        System.out.println("Set: " + set); 
  
        // Check for "Geeks" in the set 
        System.out.println("Does the Set contains 'Geeks'? "
                           + set.contains("Geeks")); 
  
        // Check for "4" in the set 
        System.out.println("Does the Set contains '4'? "
                           + set.contains("4")); 
  
        // Check if the Set contains "No" 
        System.out.println("Does the Set contains 'No'? "
                           + set.contains("No")); 
    } 
} 