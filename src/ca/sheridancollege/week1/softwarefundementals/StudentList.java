
package ca.sheridancollege.week1.softwarefundementals;

/**
 *
 * @author Michael Tran
 * Description: Learning how to use github on this java file.
 */
public class StudentList {
    
    public static void main (String[] args)
    {
        
            //1. Create an array of 5 Students
        Student [] sList = new Student[5];
        
            //2. Set names of the students
            for (int i = 0; i <= sList.length-1; i++)
            {
                sList[i] = new Student();
                sList[i].setName("Student " + (i+1));
            }
               //3. print the names
               for (Student s:sList)
               {
                   System.out.println("The Student name is: " + s.getName() );
               }
    }
            
            
}
