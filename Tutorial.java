import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The tutorial page.
 * Introduce game features and how to play the game. 
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Tutorial extends Actor
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Initial "Tutorial" image
    GreenfootImage start = new GreenfootImage("images/tut1.png");
    //New image when the mouse has been moved onto the words
    GreenfootImage move = new GreenfootImage("images/tut2.png");
    
    public void act()
    {
        //If the mouse has been moved on the "Tutorial", change color
        if(Greenfoot.mouseMoved(this)){
            setImage(move);
        }
        //Change to initial image when the mouse is not on the words
        else{
            setImage(start);
        }
        //If the mouse has been clicked on the "Tutorial", change world
        if(Greenfoot.mouseClicked(this))
        {
            TutorialPage gameWorld = new TutorialPage();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    public Tutorial(){
        setImage(start);
    }
}
