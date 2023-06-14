import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Corners.
 * There are four types.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Corner extends Walls
{
    GreenfootImage[]cornerWalls=new GreenfootImage[4];
    
    public Corner(){
        for(int i=0;i<cornerWalls.length;i++)
        {
            cornerWalls[i]=new GreenfootImage("images/corner/tile00"+i+".png");
            cornerWalls[i].scale(35,35);
        }
        
        setImage(cornerWalls[1]);
    }
}
