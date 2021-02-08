
/**
 * Write a description of class Berkshire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Berkshire extends Pig
{
    public Berkshire(String animalName, Color theColor)
    {
        // initialise instance variables
        super(animalName);
        breed = Breed.BERKSHIRE;
        color = theColor;
    }
}
