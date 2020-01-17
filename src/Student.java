// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    Scanner user_input = new Scanner(System.in);
    private String StudentName;
    private double Test_Score_01;
    private double Test_Score_02;
    //declare instance data

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------

    public Student (){
        this.StudentName= "David Dobrik";
        this.Test_Score_01= 0;
        this.Test_Score_02=0;
    }
    public Student(String studentName)
    {
        this.Test_Score_01= 0;
        this.Test_Score_02=0;
        this.StudentName = studentName;

        //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Please enter David's first test score.");
        Test_Score_01 = user_input.nextDouble();
        System.out.println("Please enter David's second test score.");
        Test_Score_02 = user_input.nextDouble();

        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
public double getAverage()
    //add header for getAverage
    {
        return (Test_Score_01+Test_Score_02)/2;
        //add body of getAverage
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName()
    //add header for printName
    {
        return StudentName;
        //add body of printName
    }

    public String toString(){

            return "Name: "+StudentName+" Test1: "+Test_Score_01+" Test2: "+Test_Score_02;
    }
    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91


}
