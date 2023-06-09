import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Actor
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Initial "New Game" image
    GreenfootImage start = new GreenfootImage("images/tut1.png");
    //New image when the mouse has been moved onto the words
    GreenfootImage move = new GreenfootImage("images/tut2.png");
    
    public void act()
    {
        // Add your action code here.
        
        if(Greenfoot.mouseMoved(this)){
            setImage(move);
        }
        //Change to initial image when the mouse is not on the words
        else{
            setImage(start);
        }
        //If the mouse has been clicked on the "New Game", change world
        if(Greenfoot.mouseClicked(this))
        {
            ;
        }
    }
    
    public Tutorial(){
        setImage(start);
    }
}
