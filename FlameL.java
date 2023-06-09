import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlameL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlameL extends Attack
{
    /**
     * Act - do whatever the FlameL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[]flame =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public void act()
    {
        // Add your action code here.
        
        animateFlame();
    }
    
    public FlameL(){
        for(int i=0;i<flame.length;i++)
        {
            flame[i]=new GreenfootImage("images/flame/L00"+i+".png");
            flame[i].scale(60,30);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial coin image
        setImage(flame[3]);
    }
    
    int imageIndex=0;
    public void animateFlame()
    {
        if(imageIndex==0){
            if(animationTimer.millisElapsed()<1600)
            {
                return;
            }
        }
        else if(imageIndex!=0){
            if(animationTimer.millisElapsed()<200)
            {
                return;
            }
        }
        animationTimer.mark();
        
        setImage(flame[imageIndex]);
        imageIndex=(imageIndex + 1) % flame.length;
    }

    
    public int getIndex(){
        return imageIndex;
    }
}
