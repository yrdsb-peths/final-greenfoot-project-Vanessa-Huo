import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialPage extends World
{

    /**
     * Constructor for objects of class TutorialPage.
     * 
     */
    public TutorialPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 735, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ToMenu toMenu = new ToMenu();
        addObject(toMenu,1005,693);
    }
}
