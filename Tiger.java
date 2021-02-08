
/**
 * Write a description of class Tiger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Tiger extends Animal
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Tiger
     */
    public Tiger(String aName)
    {
        // initialise instance variables
        super(aName);
        species = Species.TIGER;
        food = Food.CARNIVORE;        
    }

}
