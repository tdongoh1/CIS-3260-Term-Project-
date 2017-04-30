
import java.util.Scanner ;

public class Door {
	private boolean backDoorUnlocked;

    private boolean frontDoorUnlocked;
    


// Constructors

       
    // Creates a new Doors object.
    
    public Door() {
    	
    	
    	
        frontDoorUnlocked = false;
        backDoorUnlocked = false;
        
        
        
    }

    // Methods 

    public void setBackDoorUnlocked(boolean backDoorUnlocked) {
        this.backDoorUnlocked = backDoorUnlocked;
    }

    public boolean isBackDoorUnlocked() {
        return backDoorUnlocked;
    }

    public boolean isFrontDoorUnlocked() {
        return frontDoorUnlocked;
    }

    public void setFrontDoorUnlocked(boolean frontDoorUnlocked) {
        this.frontDoorUnlocked = frontDoorUnlocked;
    }

    /**
     * Unlocks front door
     */
    public void unlockFrontDoor() {
        if (frontDoorUnlocked) {
            System.out.print("Front door is already unlocked");
            return;
        }
        frontDoorUnlocked = true;
        System.out.println("Front door unlocked");
    }

    
       // Locks front door
  
    public void lockFrontDoor() {
        if (!frontDoorUnlocked) {
            System.out.println("Front door is already locked");
            return;
        }
        frontDoorUnlocked = false;
        System.out.println("Front door locked");
    }

    
     // Unlocks back door
   
    public void unlockBackDoor() {
        if (backDoorUnlocked) {
            System.out.println("Back door is already unlocked");
            return;
        }
        backDoorUnlocked = true;
        System.out.println("Back door unlocked");
    }

    
     // Locks back door
     
    public void lockBackDoor() {
        if (!backDoorUnlocked) {
            System.out.println("Back door is already locked");
            return;
        }
        backDoorUnlocked = false;
        System.out.println("Back door locked");
        return;
    }

                       
        


}
