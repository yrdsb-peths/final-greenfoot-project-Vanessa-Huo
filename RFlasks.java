import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Red flasks.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class RFlasks extends Items
{
    /**
     * Act - do whatever the RFlasks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[]rFlasks =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public void act()
    {
        //Animate the flasks
        animateBFlasks();
    }
    
    public RFlasks(){
        for(int i=0;i<rFlasks.length;i++)
        {
            rFlasks[i]=new GreenfootImage("images/flasks/flasks_4_"+(i+1)+".png");
            rFlasks[i].scale(35,35);
        }

        //Reset the timer
        animationTimer.mark();
        
        //Initial flasks image
        setImage(rFlasks[0]);
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
        
        setImage(rFlasks[imageIndex]);
        imageIndex=(imageIndex + 1) % rFlasks.length;
    }
}
