import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skull extends Attack
{
    /**
     * Act - do whatever the Skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer timer = new SimpleTimer();
    GreenfootImage skull =new GreenfootImage("images/skull/skull_v1_1.png");
    
    String facing = "right";
    
    public void act()
    {
        // Add your action code here.
        randomMove();
    }
    
    public Skull(){

        
        //Initial coin image
        skull.scale(30,30);
        setImage(skull);
    }
    
    
    public void randomMove(){
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
        timer.mark();
    }
    
}
