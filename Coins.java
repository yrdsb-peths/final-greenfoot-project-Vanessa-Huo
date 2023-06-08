import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Items
{
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage[]coins =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public void act()
    {
        // Add your action code here.
        
        animateCoins();
    }
    
    public Coins(){
        for(int i=0;i<coins.length;i++)
        {
            coins[i]=new GreenfootImage("images/coin/coin00"+i+".png");
            coins[i].scale(35,35);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial coin image
        setImage(coins[0]);
    }
    
    int imageIndex=0;
    public void animateCoins()
    {
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(coins[imageIndex]);
        imageIndex=(imageIndex + 1) % coins.length;
    }
    
}
