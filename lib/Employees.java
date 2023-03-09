public class Employees 
{
    // Step 1: Declare the variables private in the class.
    private String bakName; // private field.
    private int bakcakes;
    private int bakpaid;
    // Step 2: Apply the public getter method for each private variable.
    public String getBakName()
    {
        // Private fields can be accessed only inside public method.
        return bakName;
    }
    public int getBakcakes()
    {
        return bakcakes;
    }
    public int getBakpaid()
    {
        return bakpaid;
    }
    // Step 3: Apply the public setter method for each private variable.
    public void setBakName(String name)
    {
        bakName = name;
    }
    public void setBakcakes(int cakes)
    {
        bakcakes = cakes;
    }
    public void setBakpaid(int paid)
    {
        bakpaid = paid;
    }
}
