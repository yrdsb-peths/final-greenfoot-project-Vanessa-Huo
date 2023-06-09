import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flags here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flags extends Items
{
    /**
     * Act - do whatever the Flags wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage[]flag =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();

    public void act()
    {
        // Add your action code here.
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
        
        //Initial coin image
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
