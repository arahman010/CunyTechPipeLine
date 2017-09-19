// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class Question_3 {
    
    // Constructor
    public Question_3() {
        
    }
    
    
    // Function which is the solution to the problem
    public int getClosingParen(String sentence, int openingParenIndex) {
        if(sentence == null || sentence.length() == 0 || openingParenIndex > sentence.length()){
            return -1;              // Error Code
        }
        int counter = 0;

        for(int i = openingParenIndex; i < sentence.length(); i++){
            if(sentence.charAt(i) == '('){
                counter++;
            }
            else if(sentence.charAt(i) == ')'){
                counter--;
            }

            if(counter == 0){
                return i;
            }
        }

        return -1;      // Error Code - Not found corresponding closing paranthesis
    }
    
    public static void main(String args[]){
        
        Question_3 newClass = new Question_3();

        String input = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
        
        System.out.println("output :" + Integer.toString(newClass.getClosingParen(input,28)));
    }
}
