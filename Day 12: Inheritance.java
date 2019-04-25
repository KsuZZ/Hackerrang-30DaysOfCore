import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String fName,String lName, int id, int[] testScores){
        super(fName, lName, id);
        this.testScores = testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        int sum = 0;
        for (int i = 0; i < testScores.length; i++){
            sum = sum + testScores[i];
        }
        int gr = sum / testScores.length;
        if (gr < 40){
            return 'T';
        }
        else if (gr >= 40 && gr < 55){
            return 'D';
        }
        else if (gr >= 55 && gr < 70){
            return 'P';
        }
        else if (gr >= 70 && gr < 80){
            return 'A';
        }
        else if (gr >= 80 && gr < 90){
            return 'E';
        }
        else  return 'O';
    }
}

class Solution {
