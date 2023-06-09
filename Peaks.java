import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peaks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peaks extends Attack
{
    /**
     * Act - do whatever the Peaks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[]peaks =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public void act()
    {
        // Add your action code here.
        animatePeaks();
        
    }
    
    public Peaks(){
        for(int i=0;i<peaks.length;i++)
        {
            peaks[i]=new GreenfootImage("images/peaks/peaks00"+i+".png");
            peaks[i].scale(35,35);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial coin image
        setImage(peaks[0]);
    }
    
    int imageIndex=0;
    public void animatePeaks()
    {
        if(imageIndex==1){
            if(animationTimer.millisElapsed()<1600)
            {
                return;
            }
        }
        else if(imageIndex!=1){
            if(animationTimer.millisElapsed()<200)
            {
                return;
            }
        }
        animationTimer.mark();
        
        setImage(peaks[imageIndex]);
        imageIndex=(imageIndex + 1) % peaks.length;
    }
    
    
    public int getIndex(){
        return imageIndex;
    }
}
