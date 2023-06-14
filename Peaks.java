import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Peaks coming from the ground, stepping on them will reduce Lp
 * 
 * @author (Vanessa) 
 * @version (June 2023)
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
        //Animate the peaks 
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
        
        //Initial peak image
        setImage(peaks[0]);
    }
    
    /**
     * Animate the peaks
     */
    int imageIndex=0;
    public void animatePeaks()
    {
        //Allow the last image (imageIndex=3) to stay longer during animation
        //It's the state where no peaks are coming out and player can go
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
