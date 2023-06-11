import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The explorer, out main character
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class Explorer extends Actor
{
    /**
     * Act - do whatever the Explorer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[]idleRight=new GreenfootImage[4];
    GreenfootImage[]idleLeft=new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer timer = new SimpleTimer();
    
    //Direction the explorer is facing 
    String facing = "right";
    
    //Normal movement speed
    static int speed = 2;
    
    int spawnTimer;
    public void act()
    {
        //Move explorer with direction keys
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }  
        else if (Greenfoot.isKeyDown("right")){
            moveRight(); 
        }  
        else if (Greenfoot.isKeyDown("up")){
            moveUp();
        }
        else if (Greenfoot.isKeyDown("down")){
            moveDown(); 
        }
        //Animate the explorer
        animateExplorer();
        
        //Collect items
        collectCoins();
        collectBF();
        collectRF();
        
        //Get attacked 
        stepOnPeaks();
        touchSkull();
        burn();
        
        //If explorer escaped, call VICTORY
        MyWorld world = (MyWorld)getWorld();
        if(getY()>=world.getHeight())
        {
            world.victory();
            Greenfoot.stop();
        }
    }
    
    public Explorer()
    {
        //Load explorer images
        for(int i=0;i<idleRight.length;i++)
        {
            idleRight[i]=new GreenfootImage("images/priest/priest00"+i+".png");
            idleRight[i].scale(30,30);
        }
        
        for(int i=0;i<idleLeft.length;i++)
        {
            idleLeft[i]=new GreenfootImage("images/priest/priest00"+i+".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(30,30);
        }
        
        //Reset the timer
        animationTimer.mark();
        
        //Initial explorer image
        setImage(idleRight[0]);        
    }
    
    /**
     * If explorer steps on the peaks, reduce one Lp
     */
    public void stepOnPeaks(){
        MyWorld world = (MyWorld)getWorld();
        Peaks peak = (Peaks)getWorld().getObjects(Peaks.class).get(0);
        if(isTouching(Peaks.class))
        {
            if(peak.getIndex()==2){
                //Make the detect time to be slower
                if(timer.millisElapsed()>300){
                    world.removeLP();
                }
                timer.mark();
            }
        }
    }
    
    /**
     * If explorer collide with skull ghosts, reduce one Lp
     */
    public void touchSkull(){
        MyWorld world = (MyWorld)getWorld();
        Skull skull = (Skull)getWorld().getObjects(Skull.class).get(0);
        if(isTouching(Skull.class))
        {
            //Make the detect time to be slower
            if(timer.millisElapsed()>300){
                world.removeLP();
            }
            timer.mark();
        }
    }
    
    /**
     * If explorer get burnt by fire, reduce one Lp
     */
    public void burn(){
        MyWorld world = (MyWorld)getWorld();
        FlameT flame = (FlameT)getWorld().getObjects(FlameT.class).get(0);
        FlameL flameL = (FlameL)getWorld().getObjects(FlameL.class).get(0);
        if(isTouching(FlameT.class) || isTouching(FlameL.class))
        {
            //The specific images where fire coming from left and top
            if(flame.getIndex()==2 || flameL.getIndex()==2){
                //Make the detect time to be slower
                if(timer.millisElapsed()>300){
                    world.removeLP();
                }
                timer.mark();
            }
        }
    }
    
    /**
     * Animate the explorer
     */
    int imageIndex=0;
    public void animateExplorer()
    {
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex=(imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex=(imageIndex + 1) % idleLeft.length;
        }
    }
    
    //Increase number of coins collected when explorer touches the coin
    public void collectCoins()
    {
        if(isTouching(Coins.class))
        {
            MyWorld world = (MyWorld)getWorld();
            removeTouching(Coins.class);
            world.increaseCoins();
        }
    }
    
    //Increase number of blue flasks collected when explorer touches the flasks
    public void collectBF()
    {
        if(isTouching(BFlasks.class))
        {
            MyWorld world = (MyWorld)getWorld();
            removeTouching(BFlasks.class);
            world.increaseBF();
        }
    }
    
    //Increase number of red flasks collected when explorer touches the flasks
    public void collectRF()
    {
        if(isTouching(RFlasks.class))
        {
            MyWorld world = (MyWorld)getWorld();
            removeTouching(RFlasks.class);
            world.increaseRF();
        }
    }
    
    public void moveLeft(){
        facing = "left";
        move(-speed);
        //Move to previous position if the explorer crashed into the walls.
        if (getOneIntersectingObject(Walls.class) != null) {
            move(speed);
        }
    }
    
    public void moveRight(){
        facing = "right";
        move(speed);
        //Move to previous position if the explorer crashed into the walls.
        if (getOneIntersectingObject(Walls.class) != null) {
            move(-speed);
        }
    }
    
    public void moveUp(){
        setLocation(getX(), getY() - speed);
        //Move to previous position if the explorer crashed into the walls.
        if (getOneIntersectingObject(Walls.class) != null) {
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void moveDown(){
        setLocation(getX(), getY() + speed);
        //Move to previous position if the explorer crashed into the walls.
        if (getOneIntersectingObject(Walls.class) != null) {
            setLocation(getX(), getY() - speed);
        }
    }
}
