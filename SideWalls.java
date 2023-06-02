import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SideWalls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SideWalls extends Walls
{
    /**
     * Act - do whatever the SideWalls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage[]rightSideWalls=new GreenfootImage[2];
    GreenfootImage[]leftSideWalls=new GreenfootImage[2];
    
    public void act()
    {
        // Add your action code here.
    }
    
    public SideWalls(){
        for(int i=0;i<rightSideWalls.length;i++)
        {
            rightSideWalls[i]=new GreenfootImage("images/side/tile00"+i+".png");
            rightSideWalls[i].scale(50,50);
        }
        
        
        for(int i=0;i<leftSideWalls.length;i++)
        {
            leftSideWalls[i]=new GreenfootImage("images/side/tile00"+(i+2)+".png");
            leftSideWalls[i].scale(50,50);
        }
        
    }
}
