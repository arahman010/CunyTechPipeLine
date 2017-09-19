// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Question_1{
    
    // Constructor
    public Question_1(){
        
    }
    
    
    // Function which is the solution to the problem
    public boolean sumOfTwo(int[] a,int[] b,int v) {
        HashSet<Integer> map = new HashSet<Integer>();
        for(int a_element: a){
            map.add(v - a_element);
        }
        for(int b_element: b){
            if(map.contains(b_element)){
                return true;
            }
        }
        return false;
    
    }
    
    public static void main(String args[]){
        
        Question_1 newClass = new Question_1();
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {2,3,4};
        int v = 13;

        if(newClass.sumOfTwo(a,b,v)){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found!");
        }
        
        
    }
}
