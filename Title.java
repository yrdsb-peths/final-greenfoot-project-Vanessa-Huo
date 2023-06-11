import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Title Screen.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    
    GreenfootImage bcImage = new GreenfootImage("Tbg.png");
    
    public Title()
    {    
        // Create a new world with 1050x735 cells with a cell size of 1x1 pixels.
        super(1050,735,1);
        
        bcImage.scale(1050,735);
        setBackground(bcImage);
        
        //Add imagebuttons NewGame and Tutorial
        NewGame start = new NewGame();
        addObject(start, getWidth()/2, 450);
        Tutorial start1 = new Tutorial();
        addObject(start1, getWidth()/2, 600);
    }
}
