import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blue flasks
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class BFlasks extends Items
{
    /**
     * Act - do whatever the BFlasks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[]bFlasks =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public void act()
    {
        //Animate the flasks
        animateBFlasks();
    }
    
    public BFlasks(){
        for(int i=0;i<bFlasks.length;i++)
        {
            bFlasks[i]=new GreenfootImage("images/flasks/flasks_3_"+(i+1)+".png");
            bFlasks[i].scale(35,35);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial flasks image
        setImage(bFlasks[0]);
    }
    
    /**
     * Animate the flasks
     */
    int imageIndex=0;
    public void animateBFlasks()
    {
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(bFlasks[imageIndex]);
        imageIndex=(imageIndex + 1) % bFlasks.length;
    }
}
