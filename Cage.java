
import java.util.ArrayList;

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

    private ArrayList<Animal> animals = new ArrayList<Animal>();
    //private Animal[] animals = new Animal[5];
    //private int animalNumber;
    
    public Cage(int number)
    {
        // initialise instance variables
     
        //animalNumber = 0;
        cageNumber = number;
        
    }
    
    public boolean addAnimal(Animal inAnimal)
    {
        boolean retval = true;
        //animals[animalNumber] = inAnimal;
        //animalNumber = animalNumber + 1;
        
        // check the animal will get eaten, 
        for (int i = 0; i < animals.size(); i++) {  
            if(animals.get(i).get_food() != inAnimal.get_food())
                return false;
        }
        
        // check if the cage is full,
        if(animals.size() > 4 )
        {
            retval = false;
        }
        else
        {
        // if not:
            animals.add(inAnimal);
        }
        
        System.out.println("cage:" + cageNumber + " animals: " + animals.size());
        
        // else retval = false;
        
        return retval;
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
