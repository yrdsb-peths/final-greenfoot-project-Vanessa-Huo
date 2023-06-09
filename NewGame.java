import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGame extends Actor
{
    /**
     * Act - do whatever the NewGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Initial "New Game" image
    GreenfootImage start = new GreenfootImage("images/new1.png");
    //New image when the mouse has been moved onto the words
    GreenfootImage move = new GreenfootImage("images/new2.png");
    
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
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}