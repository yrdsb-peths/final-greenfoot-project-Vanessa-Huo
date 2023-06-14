import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Flame coming out from the top 
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class FlameT extends Attack
{
    GreenfootImage[]flame =new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Act - do whatever the Flame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Animate the flame
        animateFlame();
    }
    
    public FlameT(){
        for(int i=0;i<flame.length;i++)
        {
            flame[i]=new GreenfootImage("images/flame/00"+i+".png");
            flame[i].scale(30,60);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial flame image
        setImage(flame[3]);
    }
    
    /**
     * Animate the flame
     */
    int imageIndex=0;
    public void animateFlame()
    {
        //Allow the last image (imageIndex=3) to stay longer during animation
        //It's the state where no flame is coming out and player can go
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
    
    //Return current imageIndex
    public int getIndex(){
        return imageIndex;
    }
}
