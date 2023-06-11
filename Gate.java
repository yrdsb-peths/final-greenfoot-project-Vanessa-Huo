import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The gate. 
 * Open when all the items are collected
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Gate extends Walls
{
    /**
     * Act - do whatever the Gate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage bcImage = new GreenfootImage("gate.png");
    
    public Gate(){
        bcImage.scale(35,35);
        setImage(bcImage);
    }
    
}
