import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main world.
 * 
 * @author (Vanessa Huo) 
 * @version (May 2023)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    public int score = 0;
    
    int map[][]={{9,9,9,9,9,9,9,9,9,9,9,2,1,1,1,1,1,1,3,9,9,9,9,9,9,9,9,9,9,9},
                {9,9,9,9,9,9,9,9,9,9,9,2,0,0,0,0,0,0,3,9,9,9,9,9,9,9,9,9,9,9},
                {9,9,9,9,9,9,2,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,3,9,2,1,3,9,9,9},
                {9,9,2,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,9,2,0,3,9,9,9},
                {9,9,2,0,0,0,0,0,8,4,4,7,0,0,0,0,0,0,8,4,7,0,3,9,2,0,3,9,9,9},
                {9,9,5,4,4,7,0,8,6,9,9,5,4,7,0,0,8,4,6,9,2,0,3,9,2,0,3,9,9,9},
                {9,9,9,9,9,2,0,3,9,9,9,9,9,2,0,0,3,9,9,9,2,0,1,1,1,0,1,1,1,3},
                {9,9,9,9,2,1,0,1,3,9,9,2,1,1,0,0,1,1,3,9,2,0,0,0,0,0,0,0,0,3},
                {9,9,9,9,2,0,0,0,3,9,9,2,0,0,0,0,0,0,3,9,5,4,4,4,3,0,8,4,4,6},
                {9,9,9,9,2,0,0,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,3,0,3,9,9,9},
                {9,9,9,9,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,9,9,9},
                {2,1,1,1,1,0,0,0,8,4,4,7,0,0,0,0,0,0,8,4,7,0,0,0,0,0,1,1,1,3},
                {2,0,0,0,0,0,0,0,3,9,9,2,0,0,0,0,0,0,3,9,2,0,0,0,0,0,0,0,0,3},
                {2,0,8,7,0,8,4,4,6,9,9,5,4,7,0,0,8,4,6,9,5,4,4,4,4,4,4,7,0,3},
                {2,0,3,2,0,3,9,9,9,9,9,9,9,2,0,0,3,9,9,9,9,9,9,9,9,9,9,2,0,3},
                {2,0,4,4,0,1,1,1,1,3,9,9,2,1,0,0,1,3,9,9,2,1,1,1,1,1,1,1,0,3},
                {5,4,7,0,0,0,0,0,0,3,9,9,2,0,0,0,0,3,9,9,2,0,0,0,0,0,0,0,0,3},
                {9,9,2,0,0,0,0,0,0,1,1,1,1,0,0,0,0,3,9,9,2,0,0,0,0,0,0,0,0,3},
                {9,9,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,9,9,2,0,0,0,0,0,0,0,0,3},
                {9,9,2,0,0,0,0,0,0,8,4,4,7,0,0,0,0,3,9,9,2,0,0,0,0,0,0,0,0,3},
                {9,9,5,4,4,4,4,4,4,6,9,9,5,4,4,4,4,6,9,9,5,4,4,4,4,4,4,4,4,6}};

    Label scoringCoins1;
    Label scoringCoins2;

    
    LifePoints heart0;
    LifePoints heart1;
    LifePoints heart2;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050,735,1,false);
        makeWalls();

        createPeaks();
        createCoins();
        
        Explorer player = new Explorer();
        addObject(player,getWidth()/2,getHeight()/2);
        
        createLifePoints();

        //Create score label for coins
        scoringCoins1 = new Label(0,30);
        addObject(scoringCoins1,50,20);
        scoringCoins2 = new Label("/15",30);
        addObject(scoringCoins2,80,20);
        
        prepare();
    }
    
    public void increaseCoins(){
        score++;
        scoringCoins1.setValue(score); 
    }

    public void createPeaks(){
        int peakNum = Greenfoot.getRandomNumber(6)+2; //get random number between 2-7        
        for(int i =0; i < peakNum; i++){
            int x = Greenfoot.getRandomNumber(getRow());
            int y = Greenfoot.getRandomNumber(getCol());
            while(map[x][y]!=0)
            {
                x=Greenfoot.getRandomNumber(getRow());
                y=Greenfoot.getRandomNumber(getCol());
            }
            Peaks peak = new Peaks();
            addObject(peak,15+y*35,15+x*35);
        }
    }
    
    public void createCoins(){
        int coinNum = Greenfoot.getRandomNumber(6)+15; //get random number between 15-20        
        for(int i =0; i < coinNum; i++){
            int x = Greenfoot.getRandomNumber(getRow());
            int y = Greenfoot.getRandomNumber(getCol());
            while(map[x][y]!=0)
            {
                x=Greenfoot.getRandomNumber(getRow());
                y=Greenfoot.getRandomNumber(getCol());
            }
            Coins coin = new Coins();
            addObject(coin,15+y*35,15+x*35);
        }
    }

    public int getRow(){
        return map.length;
    }

    public int getCol(){
        return map[0].length;
    }
    
    public int getNum(int x, int y){
        return map[x][y];
    }
    
    int count = 0;
    public void removeLP()
    {
        if(count==0)
        {
            removeObject(heart0);
            count++;
        }
        else if(count==1)
        {
            removeObject(heart1);
            count++;
        }
        else
        {
            removeObject(heart2);
            count++;
        }
    }

    public void makeWalls()
    {
        for(int i =0; i<30; i++)
            for(int j=0; j<21;j++)
            {
                //Randomly add topwalls 
                if(map[j][i]==1)
                {
                    TopWalls wall = new TopWalls(); 
                    wall.setImage(wall.idleTopWalls[Greenfoot.getRandomNumber(4)]);
                    addObject(wall,15+i*35,15+j*35);
                }
                //Randomly add right sidewalls 
                else if(map[j][i]==2)
                {
                    SideWalls wall = new SideWalls(); 
                    wall.setImage(wall.rightSideWalls[Greenfoot.getRandomNumber(2)]);
                    addObject(wall,15+i*35,15+j*35);
                }
                //Randomly add left sidewalls 
                else if(map[j][i]==3)
                {
                    SideWalls wall = new SideWalls(); 
                    wall.setImage(wall.leftSideWalls[Greenfoot.getRandomNumber(2)]);
                    addObject(wall,15+i*35,15+j*35);
                }
                //Randomly add bottomwalls 
                else if(map[j][i]==4)
                {
                    BottomWalls wall = new BottomWalls(); 
                    wall.setImage(wall.idleBottomWalls[Greenfoot.getRandomNumber(2)]);
                    addObject(wall,15+i*35,15+j*35);
                }
                //Add left corner 
                else if(map[j][i]==5)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[0]);
                    addObject(wall,15+i*35,15+j*35);
                }
                //Add right corner 
                else if(map[j][i]==6)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[2]);
                    addObject(wall,15+i*35,15+j*35);
                }
                else if(map[j][i]==7)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[1]);
                    addObject(wall,15+i*35,15+j*35);
                }
                else if(map[j][i]==8)
                {
                    Corner wall = new Corner(); 
                    wall.setImage(wall.cornerWalls[3]);
                    addObject(wall,15+i*35,15+j*35);
                }
                else if(map[j][i]==9)
                {
                    Space wall = new Space(); 
                    addObject(wall,15+i*35,15+j*35);
                }
            }
    }
    
    //Create three LifePoints/hearts on the upper-right corner of the screen
    public void createLifePoints()
    {
        heart2 = new LifePoints();
        heart1 = new LifePoints(); 
        heart0 = new LifePoints(); 
        addObject(heart2, 1030, 20);
        addObject(heart1, 1000, 20);
        addObject(heart0, 970, 20);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Coins x = new Coins();
        addObject(x,20,20);
    }
}
