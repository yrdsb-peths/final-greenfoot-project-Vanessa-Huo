import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The explorer, out main character
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Explorer extends Actor
{
    /**
     * Act - do whatever the Explorer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage[]idleRight=new GreenfootImage[4];
    GreenfootImage[]idleLeft=new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    String facing = "right";
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        
        animateExplorer();
    }
    
    public Explorer()
    {
        for(int i=0;i<idleRight.length;i++)
        {
            idleRight[i]=new GreenfootImage("images/priest/priest00"+i+".png");
            idleRight[i].scale(50,50);
        }
        
        for(int i=0;i<idleLeft.length;i++)
        {
            idleLeft[i]=new GreenfootImage("images/priest/priest00"+i+".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(50,50);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial explorer image
        setImage(idleRight[0]);
    }
    
    int imageIndex=0;
    public void animateExplorer()
    {
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex=(imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex=(imageIndex + 1) % idleLeft.length;
        }
    }
    
    
}
