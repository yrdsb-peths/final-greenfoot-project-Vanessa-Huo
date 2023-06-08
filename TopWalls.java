import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TopWalls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopWalls extends Walls
{
    /**
     * Act - do whatever the TopWalls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    GreenfootImage[]idleTopWalls=new GreenfootImage[4];
    
    public TopWalls(){
        for(int i=0;i<idleTopWalls.length;i++)
        {
            idleTopWalls[i]=new GreenfootImage("images/top/tile00"+i+".png");
            idleTopWalls[i].scale(35,35);
        }
        
        setImage(idleTopWalls[1]);
    }
}
