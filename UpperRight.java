import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpperRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpperRight extends World
{

    /**
     * Constructor for objects of class UpperRight.
     * 
     */
    
    int map[][]={{0,0,0,0,0,0,0,0,0,0,0,0},
                 {0,0,0,0,0,0,0,0,0,0,0,0},
                 {1,1,1,1,3,0,2,1,3,0,0,0},
                 {0,0,0,0,3,0,2,0,3,0,0,0},
                 {8,4,7,0,3,0,2,0,3,0,0,0},
                 {3,0,2,0,3,0,2,0,3,0,0,0},
                 {0,0,2,0,1,1,1,0,1,1,1,3},
                 {3,0,2,0,0,0,0,0,0,0,0,3}};
    
    public UpperRight()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        makeWalls();
    }
    
    public void act(){
        Actor actor = (Actor)getObjects(Explorer.class).get(0);
        if(actor.getY() >= 390){
            RightRoom gameWorld = new RightRoom();
            gameWorld.addObject(actor,actor.getX(),15);
            Greenfoot.setWorld(gameWorld);
        }
        else if(actor.getX() <= 100){
            UpRoom gameWorld = new UpRoom();
            gameWorld.addObject(actor,580,actor.getY());
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    public void makeWalls()
    {
        for(int i =0; i<12; i++)
            for(int j=0; j<8;j++)
            {
                //Randomly add topwalls 
                if(map[j][i]==1)
                {
                    TopWalls wall = new TopWalls(); 
                    wall.setImage(wall.idleTopWalls[Greenfoot.getRandomNumber(4)]);
                    addObject(wall,25+i*50,25+j*50);
                }
                //Randomly add right sidewalls 
                else if(map[j][i]==2)
                {
                    SideWalls wall = new SideWalls(); 
                    wall.setImage(wall.rightSideWalls[Greenfoot.getRandomNumber(2)]);
                    addObject(wall,25+i*50,25+j*50);
                }
                //Randomly add left sidewalls 
                else if(map[j][i]==3)
                {
                    SideWalls wall = new SideWalls(); 
                    wall.setImage(wall.leftSideWalls[Greenfoot.getRandomNumber(2)]);
                    addObject(wall,25+i*50,25+j*50);
                }
                //Randomly add bottomwalls 
                else if(map[j][i]==4)
                {
                    BottomWalls wall = new BottomWalls(); 
                    wall.setImage(wall.idleBottomWalls[Greenfoot.getRandomNumber(2)]);
                    addObject(wall,25+i*50,25+j*50);
                }
                //Add left corner 
                else if(map[j][i]==5)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[0]);
                    addObject(wall,25+i*50,25+j*50);
                }
                //Add right corner 
                else if(map[j][i]==6)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[2]);
                    addObject(wall,25+i*50,25+j*50);
                }
                else if(map[j][i]==7)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[1]);
                    addObject(wall,25+i*50,25+j*50);
                }
                else if(map[j][i]==8)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[3]);
                    addObject(wall,25+i*50,25+j*50);
                }
                
            }
    }
}
