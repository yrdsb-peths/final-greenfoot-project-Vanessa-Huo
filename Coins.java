import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Coins.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Coins extends Items
{
    GreenfootImage[]coins =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    public void act()
    {
        //Animat the coins
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
