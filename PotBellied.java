
/**
 * Write a description of class PotBellied here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PotBellied extends Pig
{
    public PotBellied(String animalName, Color theColor)
    {
        // initialise instance variables
        super(animalName);
        breed = Breed.POTBELLIED;
        color = theColor;
    }
}
