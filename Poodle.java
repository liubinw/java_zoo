
/**
 * Write a description of class Poodle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poodle extends Dog
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Poodle
     */
    public Poodle(String animalName)
    {
        // initialise instance variables
        name = animalName;
        breed = Breed.POODLE;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
