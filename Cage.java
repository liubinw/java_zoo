
/**
 * Write a description of class Cage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cage
{
    // instance variables - replace the example below with your own
    private int cageNumber;

    private Animal[] animals = new Animal[5];
    private int animalNumber;
    
    /**
     * Constructor for objects of class Cage
     */
    public Cage()
    {
        // initialise instance variables
     
        animalNumber = 0;
        //poodles = new Poodle[5];
        /*
        for (int i = 0 ; i < 5 ; i++) {
            poodles[i] = new Poodle();
        }
        */
        //poodles[0] = new Poodle("Cuty");
        
    }

    public Cage(int number)
    {
        // initialise instance variables
     
        animalNumber = 0;
        cageNumber = number;
        
    }
    
    public void addAnimal(Animal inAnimal)
    {
        animals[animalNumber] = inAnimal;
        animalNumber = animalNumber + 1;
    }
    
    public void setNumber(int number)
    {
        cageNumber = number;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNumber()
    {
        // put your code here
        return cageNumber;
    }
}
