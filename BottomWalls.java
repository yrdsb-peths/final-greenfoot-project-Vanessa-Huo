import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomWalls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomWalls extends Walls
{
    /**
     * Act - do whatever the BottomWalls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    GreenfootImage[]idleBottomWalls=new GreenfootImage[4];
    
    public BottomWalls(){
        for(int i=0;i<idleBottomWalls.length;i++)
        {
            idleBottomWalls[i]=new GreenfootImage("images/bottom/tile00"+i+".png");
            idleBottomWalls[i].scale(50,50);
        }
        
        setImage(idleBottomWalls[1]);
    }
}
