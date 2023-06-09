import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ending screen 
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class End extends World
{
    SimpleTimer gameTimer = new SimpleTimer();
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 1050x735 cells with a cell size of 1x1 pixels.
        super(1050, 735, 1); 
        gameTimer.mark();
    }
    
    /**
     * Call "Game Over" and stop the game. 
     */
    public void gameOver(){
        GameOver over = new GameOver();
        addObject(over,getWidth()/2,getHeight()/2);
        gameTimer.mark();
        //Greenfoot.stop();
    }
    
    /**
     * Call VICTORY and show the time used when player escaped. 
     */
    public void victory(){
        Congratulation con = new Congratulation();
        addObject(con,getWidth()/2,260);
        Label gameOverLabel2 = new Label("You have escaped from the dungeon!", 50);
        int x = gameTimer.millisElapsed()/1000;
        //Show the time used by player to escape
        Label gameOverLabel3 = new Label("Score time: "+x+" second", 50);
        addObject(gameOverLabel2,getWidth()/2,430);
        addObject(gameOverLabel3,getWidth()/2,570);
        gameTimer.mark();
        //Greenfoot.stop();
    }
}
