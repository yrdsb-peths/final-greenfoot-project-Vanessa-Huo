import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * LifePoints system, explorer only has three LifePoints.
 * GameOver when LifePoints becomes zero.
 * Getting burnt, stepping on the peaks, touching skull can reduce LifePoints.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class LifePoints extends Actor
{
    GreenfootImage lp = new GreenfootImage("images/lp.png");
    
    //Create LifePoints
    public LifePoints()
    {
        setImage(lp);
        lp.scale(30,30);
    }
}
