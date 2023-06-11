import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Image "back to menu"
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class ToMenu extends Actor
{
    /**
     * Act - do whatever the ToMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //If it's clicked, go back to title screen
        if(Greenfoot.mouseClicked(this))
        {
            Title gameWorld = new Title();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
