
/**
 * Write a description of class Lion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Lion extends Animal
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Lion
     */
    public Lion(String aName)
    {
        // initialise instance variables
        super(aName);
        species = Species.LION;
        food = Food.CARNIVORE;
    }

}
