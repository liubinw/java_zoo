
/**
 * Write a description of class Labrador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Labrador extends Dog
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Labrador
     */
    public Labrador(String animalName, Color theColor)
    {
        // initialise instance variables
        super(animalName);
        breed = Breed.LABRADOR;
        color = theColor;
    }


}
