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
    
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050,735,1);
        
        bcImage.scale(1050,735);
        setBackground(bcImage);
        
        NewGame start = new NewGame();
        Tutorial start1 = new Tutorial();
        addObject(start, getWidth()/2, 450);
        addObject(start1, getWidth()/2, 600);
        
    }
}
