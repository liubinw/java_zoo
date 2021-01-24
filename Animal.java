


/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Animal
{
enum Color {
  Brown,
  Red,
  Green,
  Yellow
}

enum Species {
    DOG,
    CAT,
    LION,
    TIGER,
    TURTLE,
    PIG
}

enum Breed {
    POODLE,
    LABRADOR,
    BANGAR
}
    // instance variables - replace the example below with your own
    protected String name;
    protected Color color;
    protected int x;
    protected Species species;
    protected Breed breed;
    
    
    
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        // initialise instance variables
        x = 0;
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
