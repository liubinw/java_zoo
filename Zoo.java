
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

    
    
    
    /**
     * Constructor for objects of class Zoo
     */
    public Zoo(String zooName)
    {
        // initialise instance variables
        x = 0;
        name = zooName;
        
        System.out.println("This is the Zoo constructor, zoo: " + name);
       
        
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
