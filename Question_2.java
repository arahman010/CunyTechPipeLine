// Date:
// Problem
// Question:

// Assumption Made: Spaces are also considered as characters

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class Question_2 {
    
    // Constructor
    public Question_2() {
        
    }
    
    
    // Function which is the solution to the problem
    public String stringReformatting(String s,int k) {
        if(s == null || s.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '-'){
                sb.append(s.charAt(i));
            }
        }

        // int length = sb.length();
        if(k >= sb.length()){
            return sb.toString();
        }
        int dashIndex = sb.length() % k;

        while(dashIndex < sb.length()){
            if(dashIndex != 0){
                sb.insert(dashIndex,'-');
                dashIndex++;
            }
            dashIndex += k;
        }
        return sb.toString();
        
    }
    
    public static void main(String args[]){
        
        Question_2 newClass = new Question_2();

        String s = "2-4a0r7-4k";
        
        System.out.println(s + " : " + newClass.stringReformatting(s,3));
    }
}
