
/**
 * Write a description of class Turtle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Turtle extends Animal
{
    // instance variables - replace the example below with your own
 
    /**
     * Constructor for objects of class Turtle
     */
    public Turtle(String aName)
    {
        // initialise instance variables
        super(aName);
        species = Species.TURTLE;
        food = Food.HERBIVORE;
        
    }

}
