import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tutorial page
 * 
 * @author (Vanessa) 
 * @version (June 2023)
 */
public class TutorialPage extends World
{

    /**
     * Constructor for objects of class TutorialPage.
     * 
     */
    public TutorialPage()
    {    
        // Create a new world with 1050x735 cells with a cell size of 1x1 pixels.
        super(1050, 735, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Add imagebutton "return back to title screen"
        ToMenu toMenu = new ToMenu();
        addObject(toMenu,1005,693);
    }
}
