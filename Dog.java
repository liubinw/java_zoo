
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Dog extends Animal
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Dog
     */
    public Dog(String aName)
    {
        // initialise instance variables
        super(aName);
        species = Species.DOG;
        food = Food.OMNIVORE;
        
        
    }

}
