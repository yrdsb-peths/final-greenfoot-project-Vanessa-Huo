import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMenu extends Actor
{
    /**
     * Act - do whatever the ToMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Title gameWorld = new Title();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
