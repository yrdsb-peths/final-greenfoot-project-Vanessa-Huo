import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Left and right sideWalls.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class SideWalls extends Walls
{
    GreenfootImage[]rightSideWalls=new GreenfootImage[2];
    GreenfootImage[]leftSideWalls=new GreenfootImage[2];
    
    public SideWalls(){
        for(int i=0;i<rightSideWalls.length;i++)
        {
            rightSideWalls[i]=new GreenfootImage("images/side/tile00"+i+".png");
            rightSideWalls[i].scale(35,35);
        }
        
        
        for(int i=0;i<leftSideWalls.length;i++)
        {
            leftSideWalls[i]=new GreenfootImage("images/side/tile00"+(i+2)+".png");
            leftSideWalls[i].scale(35,35);
        }
        
    }
}
