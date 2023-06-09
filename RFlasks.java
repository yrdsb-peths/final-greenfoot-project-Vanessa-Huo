import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RFlasks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Add your action code here.
        
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
        
        //Initial coin image
        setImage(rFlasks[0]);
    }
    
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
