import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The words "New Game" on the title screen.
 * Click to start a new game.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class NewGame extends Actor
{
    //Initial "New Game" image
    GreenfootImage start = new GreenfootImage("images/new1.png");
    //New image when the mouse has been moved onto the words
    GreenfootImage move = new GreenfootImage("images/new2.png");
    
    /**
     * Act - do whatever the NewGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //If the mouse has been moved on the "New Game", change color
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
    
    public NewGame(){
        setImage(start);
    }
}
