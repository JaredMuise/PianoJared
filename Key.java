import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String notPressed;
    private String pressed;
    
    
    
    
    public Key( String keyName, String soundFile, String keyNotPressed, String keyPressed)
    {
       key = keyName; 
       sound = soundFile;
       notPressed = keyNotPressed;
       pressed = keyPressed;
       
       setImage( notPressed + ".png" );
    }
    
    
    /**
     * Do the action for this key.
     */
    public void act()
    {
        if( isDown == false && Greenfoot.isKeyDown(key) )
        { 
           setImage( pressed + ".png" ); 
           
           isDown = true;
           play();
        }
        
        if( isDown == true && !Greenfoot.isKeyDown(key) )
        {
            setImage( notPressed + ".png" );
            
            isDown = false;
            
        }
        
        
    }
    
    
    /**
     *  play() plays the sound file of the piano notes.
     *  
     *  @params There are no paramters.
     *  @return There is nothing to return.
     */
    private void play()
    {
        Greenfoot.playSound( sound + ".wav" );
    }

     /**
     * boolean checkDown returns the isDown value when called.
     * 
     * 
     * @param There are no paramters
     * @return Returns  the isDownBoolean, whicth is true when this key object is presssed.
     */
    public boolean checkDown()
	{
		return isDown; 
	}


  
}

