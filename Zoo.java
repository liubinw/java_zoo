
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
        
        /*
        myCages[0] = new Cage();
        myCages[1] = new Cage();
        myCages[0].setNumber(100);
        myCages[1].setNumber(200);
        */
       
        Poodle poodle1 = new Poodle("p1");
        myCages[0].addAnimal(poodle1);
        Poodle poodle2 = new Poodle("cutty");
        myCages[0].addAnimal(poodle2);
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
