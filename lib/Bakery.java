public class Bakery 
{
    public static void main(String[] args)
    {
        // Step 4: Create the object of class Student by using the new keyword. obj is the reference variable of class student and pointing to the object of the student class.
        Employees obj = new Employees();
        
        // Step 5: Call the setter method and set the value of variables.
        obj.setBakName("Bob");
        obj.setBakcakes(100);
        obj.setBakpaid(10);
        
        // Step 6: Call the getter method to Read the value of variables and print it.
        System.out.println("Baker's Name: " +obj.getBakName());
        System.out.println("Baker's Covered Cakes no.: " +obj.getBakcakes());
        System.out.println("Baker's Pay: " +obj.getBakpaid());
        System.out.println("Baker's Wage: " +obj.getBakcakes() * +obj.getBakpaid() / 100 );
    }
}

