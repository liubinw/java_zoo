
/**
 * Write a description of class Poodle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poodle extends Dog
{
    // instance variables - replace the example below with your own
    //final private String x;

    /**
     * Constructor for objects of class Poodle
     */
    public Poodle(String animalName, Color theColor)
    {
        // initialise instance variables
        super(animalName);
        breed = Breed.POODLE;
        color = theColor;
        //x = animalName;
        //test = animalName;
    }


}
