


/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Animal implements Comparable<Animal>
//abstract class Animal
{

enum Species {
    DOG,
    CAT,
    LION,
    TIGER,
    TURTLE,
    PIG
}

enum Breed {
    POODLE,
    LABRADOR,
    MUD,
    BANGAR,
    MALAYAN,
    KEESHOND,
    TIBTANMASTIFF,
    SNAPPING,
    POTBELLIED,
    BERKSHIRE
}

enum Food {
    OMNIVORE,
    HERBIVORE,
    CARNIVORE
}
    // instance variables - replace the example below with your own
    final protected String name;
    protected Color color;
    protected Species species;
    protected Breed breed;
    protected Food food;
    
    public String get_name()
    {
        return name;
    }
    
    public Breed get_breed()
    {
        return breed;
    }
    
    public void report()
    {
        System.out.println("Hi, my name is:"+name+" my color is: " + color);
        System.out.println("    my species is:"+species+" my breed is: " + breed + " food:" + food);
    }
    
    //final protected String test;
    Food get_food()
    {
        return food;
    }
    
    Species get_species()
    {
        return species;
    }
    
    /**
     * Constructor for objects of class Animal
     */
    public Animal(String aName)
    {
        // initialise instance variables
        name = aName;
    }

    
    @Override
    public int compareTo(Animal compare_animal) {
        //return this.name.compareTo(compare_animal.get_name());
        int in_breed = compare_animal.get_breed().ordinal();
        return breed.ordinal() - in_breed;
    }
    

}
