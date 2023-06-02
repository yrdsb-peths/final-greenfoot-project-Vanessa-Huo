import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Corner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corner extends Walls
{
    /**
     * Act - do whatever the Corner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    GreenfootImage[]cornerWalls=new GreenfootImage[4];
    
    public Corner(){
        for(int i=0;i<cornerWalls.length;i++)
        {
            cornerWalls[i]=new GreenfootImage("images/corner/tile00"+i+".png");
            cornerWalls[i].scale(50,50);
        }
        
        setImage(cornerWalls[1]);
    }
}
