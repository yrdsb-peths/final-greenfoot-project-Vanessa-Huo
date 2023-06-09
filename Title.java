import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    
    GreenfootImage bcImage = new GreenfootImage("Tbg.png");
    NewGame start = new NewGame();
    
    
    
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050,735,1);
        
        bcImage.scale(1050,735);
        setBackground(bcImage);
        
        addObject(start, getWidth()/2, 450);
        Tutorial start1 = new Tutorial();
        addObject(start1, getWidth()/2, 600);
        
    }
}
