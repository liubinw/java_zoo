
/**
 * Write a description of class Pig here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Pig extends Animal
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Pig
     */
    public Pig()
    {
        // initialise instance variables
        x = 0;
        species = Species.PIG;
        food = Food.HERBIVORE;
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
