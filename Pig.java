
/**
 * Write a description of class Pig here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Pig extends Animal
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Pig
     */
    public Pig(String aName)
    {
        // initialise instance variables
        super(aName);  // name property is defined as final
        // or this can be assiged here: name = aName;
        species = Species.PIG;
        food = Food.HERBIVORE;
    }

}
