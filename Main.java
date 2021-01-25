
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{

    public static void main(String[] args) {
        
        System.out.println("Hello Welcome to the Zoo Application");
        Zoo zoo1 = new Zoo("Toronto Zoo");
        //Test t = Test.T1;
        //Breed b = Breed.POODLE;
        Animal aAnimal; 
        // add lots of animals:
        for(int i=0; i<5; ++i)
        {
            
            aAnimal = new Poodle("poodle"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal);
            
            aAnimal = new Labrador("labrador"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal);    
            
            aAnimal = new Bangar("bangar"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            aAnimal = new Malayan("malayan"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            aAnimal = new Keeshond("keeshond"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
                        
            aAnimal = new TibtanMastiff("tibtanmastiff"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            aAnimal = new Snapping("l"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            aAnimal = new Mud("l"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            aAnimal = new Berkshire("l"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            aAnimal = new PotBellied("l"+i, Color.RED);
            zoo1.receiveAnimal(aAnimal); 
            
            
        }
        
        
        /*
        Poodle poodle1 = new Poodle("p1", Color.RED);
        Poodle poodle2 = new Poodle("cutty",Color.BLUE);
        
        zoo1.receiveAnimal(poodle1);
        zoo1.receiveAnimal(poodle2);
        */
        
        // check with the zoo, are you all done?
        
        
        // check with the zoo, how many animals do you have:
        
        // check with the zoo, make the animal sound: 
       
  
    }
    
    
}
