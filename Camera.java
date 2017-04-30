import java.util.Scanner;

import javax.swing.JOptionPane;


public class Camera{ 
private Scanner scan = new Scanner(System.in);

	public void camPower(String power){
		if(power.equalsIgnoreCase("Turn a camera on")){
			String[] b = {"Front Door", "Back Door", "Foyer", "Kitchen", "Garage"};

			String camPower = (String) JOptionPane.showInputDialog(null, "Which camera should I turn on", "Camera", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);

			camOn(camPower);
			
		}
		else if(power.equalsIgnoreCase("Turn a camera Off")){
			
			String[] b = {"Front Door", "Back Door", "Foyer", "Kitchen", "Garage"};

			String camPowerOff = (String) JOptionPane.showInputDialog(null, "Which camera should I turn off", "Camera", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);
			
	
			camOff(camPowerOff);	
		}
	 
		}
	
	public void camOn(String whichCam){
	
			JOptionPane.showMessageDialog(null, whichCam + "is now on!");
		}
	
	public void camOff(String whichCamOff){
		
			
			JOptionPane.showMessageDialog(null, whichCam + "is now off!","Camera");
	}
}

