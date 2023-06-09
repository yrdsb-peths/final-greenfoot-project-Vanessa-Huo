import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main world.
 * 
 * @author (Vanessa Huo) 
 * @version (May 2023)
 */
public class MyWorld extends World
{
    public int scoreC = 0;
    public int scoreB = 0;
    public int scoreR = 0;
    SimpleTimer timer = new SimpleTimer();
    GreenfootSound bgm = new GreenfootSound("bgm.wav");
    
    
    Label scoringCoins1;
    Label scoringCoins2;
    Label BF1;
    Label BF2;
    Label RF1;
    Label RF2;

    LifePoints heart0;
    LifePoints heart1;
    LifePoints heart2;
    Gate gate = new Gate();
    Label open;
    
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

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050,735,1,false);
        bgm.setVolume(25);
        bgm.playLoop();
        
        getGate();
        makeWalls();

        createPeaks();
        createFlameT();
        createFlameL();
        createBFlasks();
        createRFlasks();
        createCoins();
        
        Explorer player = new Explorer();
        addObject(player,getWidth()/2,getHeight()/2);

        //Create score label for coins
        
        prepare();
        
        View view = new View(player);
        addObject(view,player.getX(),player.getY());
        
        items();
        
        createLifePoints();
        scoringCoins1 = new Label(0,30);
        addObject(scoringCoins1,50,20);
        scoringCoins2 = new Label("/15",30);
        addObject(scoringCoins2,90,20);
        BF1 = new Label(0,30);
        addObject(BF1,50,50);
        BF2 = new Label("/2",30);
        addObject(BF2,80,50);
        RF1 = new Label(0,30);
        addObject(RF1,50,80);
        RF2 = new Label("/2",30);
        addObject(RF2,80,80);
        
        check();
        
    }
    
    public void check(){
        if(scoreC >= 15 && scoreB == 2 && scoreR == 2){
            if(gate != null){
                removeObjects(getObjects(Gate.class));
                open = new Label("The Gate is Now Opened", 50);
                addObject(open,500,120);
            }
        }
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 80);
        addObject(gameOverLabel,getWidth()/2,getHeight()/2);
        bgm.stop();
        Greenfoot.stop();
    }
    
    public void victory(){
        Label gameOverLabel1 = new Label("Congratulation!", 80);
        Label gameOverLabel2 = new Label("You have escaped from the dungeon!", 50);
        addObject(gameOverLabel1,getWidth()/2,290);
        addObject(gameOverLabel2,getWidth()/2,470);
        bgm.stop();
        Greenfoot.stop();
    }
    
    public void increaseCoins(){
        scoreC++;
        scoringCoins1.setValue(scoreC); 
        check();
    }
    
    public void increaseBF(){
        scoreB++;
        BF1.setValue(scoreB); 
        check();
    }
    
    public void increaseRF(){
        scoreR++;
        RF1.setValue(scoreR); 
        check();
    }
    
    int num = Greenfoot.getRandomNumber(getCol());
    public void getGate(){
        while(map[20][num]!=4){
            num = Greenfoot.getRandomNumber(getCol());
        }
        map[20][num]=10;
    }

    public void createPeaks(){
        int peakNum = Greenfoot.getRandomNumber(4)+3; //get random number between 3-6        
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
    
    public void createFlameT(){
        int flameNum = Greenfoot.getRandomNumber(2)+2; //get random number between 2-3        
        for(int i =0; i < flameNum; i++){
            int x = Greenfoot.getRandomNumber(getRow());
            int y = Greenfoot.getRandomNumber(getCol());
            while(map[x][y]!=1)
            {
                x=Greenfoot.getRandomNumber(getRow());
                y=Greenfoot.getRandomNumber(getCol());
            }
            FlameT flame = new FlameT();
            addObject(flame,15+y*35,30+x*35);
        }
    }
    
    public void createFlameL(){
        int flameNum = Greenfoot.getRandomNumber(2)+2; //get random number between 2-3        
        for(int i =0; i < flameNum; i++){
            int x = Greenfoot.getRandomNumber(getRow());
            int y = Greenfoot.getRandomNumber(getCol());
            while(map[x][y]!=2)
            {
                x=Greenfoot.getRandomNumber(getRow());
                y=Greenfoot.getRandomNumber(getCol());
            }
            FlameL flame = new FlameL();
            addObject(flame,60+y*35,15+x*35);
        }
    }
    
    public void createRFlasks(){       
        for(int i =0; i < 2; i++){
            int x = Greenfoot.getRandomNumber(getRow());
            int y = Greenfoot.getRandomNumber(getCol());
            while(map[x][y]!=0)
            {
                x=Greenfoot.getRandomNumber(getRow());
                y=Greenfoot.getRandomNumber(getCol());
            }
            RFlasks rFlasks = new RFlasks();
            addObject(rFlasks,15+y*35,15+x*35);
        }
    }
    
    public void createBFlasks(){       
        for(int i =0; i < 2; i++){
            int x = Greenfoot.getRandomNumber(getRow());
            int y = Greenfoot.getRandomNumber(getCol());
            while(map[x][y]!=0)
            {
                x=Greenfoot.getRandomNumber(getRow());
                y=Greenfoot.getRandomNumber(getCol());
            }
            BFlasks bFlasks = new BFlasks();
            addObject(bFlasks,15+y*35,15+x*35);
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
            gameOver();
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
                else if(map[j][i]==10)
                { 
                    addObject(gate,15+i*35,15+j*35);
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
        Flags flags = new Flags();
        addObject(flags,450,260);
        Flags flags2 = new Flags();
        addObject(flags2,590,260);
        Flags flags3 = new Flags();
        addObject(flags3,190,260);
        Flags flags4 = new Flags();
        addObject(flags4,258,260);
        Flags flags5 = new Flags();
        addObject(flags5,330,610);
        Flags flags6 = new Flags();
        addObject(flags6,435,610);
        Flags flags7 = new Flags();
        addObject(flags7,852,227);
        Flags flags8 = new Flags();
        addObject(flags8,923,226);
        Flags flags9 = new Flags();
        addObject(flags9,470,15);
        Flags flags10 = new Flags();
        addObject(flags10,575,15);
        Flags flags11 = new Flags();
        addObject(flags11,815,540);
        Flags flags12 = new Flags();
        addObject(flags12,890,540);
    }
    
    private void items(){
        Coins x = new Coins();
        addObject(x,20,20);  
        BFlasks bFlasks = new BFlasks();
        addObject(bFlasks,20,50);
        RFlasks rFlasks = new RFlasks();
        addObject(rFlasks,20,80);
    }
}
