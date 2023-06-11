import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The skull ghosts wandering around in the dungeon.
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Skull extends Attack
{
    /**
     * Act - do whatever the Skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer timer = new SimpleTimer();
    GreenfootImage skull =new GreenfootImage("images/skull/skull_v1_1.png");
    public void act()
    {
        //Random movement
        randomMove();
    }
    
    public Skull(){
        //Initial skull image
        skull.scale(30,30);
        setImage(skull);
    }
    
    //Random movement in the dungeon
    public void randomMove(){
        //Speed of the movement
        if(timer.millisElapsed()>16.5){
            move(2);
            if(Greenfoot.getRandomNumber(100)<10){
                //turn(Greenfoot.getRandomNumber(50)-60);
                turn(90);
            }
            if(getOneIntersectingObject(Walls.class) != null){
                turn(90);
            }
        }
        //Reset timer
        timer.mark();
    }
}
