
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private int x;
    public Cage[] myCages = { 
                    new Cage(100), new Cage(200), new Cage(300), new Cage(400),
                    new Cage(500), new Cage(600), new Cage(700), new Cage(800) 
                };
                //new Cage[8];
    private String name;

    
    public void fillAnimals()
    {
        Animal aAnimal; 
        // add lots of animals:
        for(int i=0; i<3; ++i)
        {
            
            aAnimal = new Poodle("poodle"+i, Color.RED);
            if(receiveAnimal(aAnimal)==false)
            {
                System.out.println("failed adding Poodle " + i);
            }
            
            aAnimal = new Labrador("labrador"+i, Color.RED);
            receiveAnimal(aAnimal);    
            
            aAnimal = new Bangar("bangar"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            aAnimal = new Malayan("malayan"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            aAnimal = new Keeshond("keeshond"+i, Color.RED);
            receiveAnimal(aAnimal); 
                        
            aAnimal = new TibtanMastiff("tibtanmastiff"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            aAnimal = new Snapping("l"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            aAnimal = new Mud("l"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            aAnimal = new Berkshire("l"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            aAnimal = new PotBellied("l"+i, Color.RED);
            receiveAnimal(aAnimal); 
            
            
        }
        
        
        /*
        Poodle poodle1 = new Poodle("p1", Color.RED);
        Poodle poodle2 = new Poodle("cutty",Color.BLUE);
        
        zoo1.receiveAnimal(poodle1);
        zoo1.receiveAnimal(poodle2);
        */
        
    }
    
    
    /**
     * Constructor for objects of class Zoo
     */
    public Zoo(String zooName)
    {
        // initialise instance variables
        x = 0;
        name = zooName;
        
        System.out.println("This is the Zoo constructor, zoo: " + name);
       
        fillAnimals();
        
    }

    public boolean receiveAnimal(Animal oneAnimal)
    {
        //boolean retval = true;
        
        // find a good cage, and put this animal in:
        // loop through cages, 
        // if case is good
        for(int i=0;i<8;++i)
        {
            if(myCages[i].addAnimal(oneAnimal)==true)
            {
                return true;
            }
            
        }
        
        //return myCages[0].addAnimal(oneAnimal);
        //return retval;
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
