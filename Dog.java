
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Dog extends Animal
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        // initialise instance variables
        x = 0;
        species = Species.DOG;
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
