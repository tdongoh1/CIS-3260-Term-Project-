import java.util.Scanner;

import javax.swing.JOptionPane;


public class Door{ 
private Scanner scan = new Scanner(System.in);

	public void doorPower(String power){
		if(power.equalsIgnoreCase("Unlock")){
			String[] b = {"Front Door", "Back Door", "Side Door", "Kitchen Door", "Garage Door"};

			String doorPower = (String) JOptionPane.showInputDialog(null, "Which door should I unlock? ", "Door", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);

			doorUnlock(doorPower);
			
		}
		else if(power.equalsIgnoreCase("Lock")){
			
			String[] b = {"Front Door", "Back Door", "Foyer", "Kitchen", "Garage"};

			String doorPowerLock = (String) JOptionPane.showInputDialog(null, "Which door should I lock? ", "Door", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);
			
	
			doorLock(doorPowerLock);	
		}
	 
		}
	
	public void doorUnlock(String whichDoor){
	
			JOptionPane.showMessageDialog(null, whichDoor + " is now unlocked!");
		}
	
	public void doorLock(String whichDoorLock){
		
			
			JOptionPane.showMessageDialog(null, whichDoorLock + " is now locked!");
	}
}
