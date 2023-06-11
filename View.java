import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The view screen. 
 * Get rid of it if you want to cheat.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class View extends Actor
{
    /**
     * Act - do whatever the View wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int width = 1050;
    int height = 735;   
     
    World world = getWorld();
    GreenfootImage bkg;
    public Explorer pp;
     
    public View(Explorer p)
    {
        bkg = new GreenfootImage("foc.png");
        pp=p;
        setImage(bkg);        
    }
    
    //Let the view screen to move with the explorer
    public void act() 
    {
        setLocation(pp.getX(), pp.getY());
    }
}
