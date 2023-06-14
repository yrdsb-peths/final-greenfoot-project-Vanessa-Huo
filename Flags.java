import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Decoration flags 
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Flags extends Items
{
    GreenfootImage[]flag =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();

    public void act()
    {
        //Animate the flags
        animateFlags();
    }
    
    public Flags(){
        for(int i=0;i<flag.length;i++)
        {
            flag[i]=new GreenfootImage("images/flag/flag00"+i+".png");
            flag[i].scale(30,30);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial flag image
        setImage(flag[0]);
    }
    
    int imageIndex=0;
    public void animateFlags()
    {
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(flag[imageIndex]);
        imageIndex=(imageIndex + 1) % flag.length;
    }
}
