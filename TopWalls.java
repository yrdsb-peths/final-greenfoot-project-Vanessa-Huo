import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Topwalls.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class TopWalls extends Walls
{
    /**
     * Act - do whatever the TopWalls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
