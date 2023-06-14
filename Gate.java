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
    
    GreenfootImage bcImage = new GreenfootImage("gate.png");
    
    public Gate(){
        bcImage.scale(35,35);
        setImage(bcImage);
    }
    
}
