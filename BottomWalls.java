import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * BottomWalls.
 * There are four types.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class BottomWalls extends Walls
{
    GreenfootImage[]idleBottomWalls=new GreenfootImage[4];
    public BottomWalls(){
        //Load four bottom wall images 
        for(int i=0;i<idleBottomWalls.length;i++)
        {
            idleBottomWalls[i]=new GreenfootImage("images/bottom/tile00"+i+".png");
            idleBottomWalls[i].scale(35,35);
        }
        
        //Initial wall image
        setImage(idleBottomWalls[1]);
    }
}
