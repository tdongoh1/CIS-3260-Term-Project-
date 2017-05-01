import java.util.Scanner;

import javax.swing.JOptionPane;


public class Camera{ 
private Scanner scan = new Scanner(System.in);

	public void camPower(String power){
		if(power.equalsIgnoreCase("turn a camera on")){
			String[] b = {"All cameras","Front Door camera", "Back Door camera", "Foyer camera", "Kitchen camera", "Garage camera"};

			String camPower = (String) JOptionPane.showInputDialog(null, "Which camera should I turn on", "Camera", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);

			camOn(camPower);
			
		}
		else if(power.equalsIgnoreCase("turn a camera off")){
			
			String[] b = {"All cameras", "Front Door camera", "Back Door camera", "Foyer camera", "Kitchen camera", "Garage camera"};

			String camPowerOff = (String) JOptionPane.showInputDialog(null, "Which camera should I turn off", "Camera", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);
			
	
			camOff(camPowerOff);	
		}
	 
		}
	
	public void camOn(String whichCam){
	
			System.out.println(whichCam + " now on!" );
		}
	
	public void camOff(String whichCamOff){
		
				System.out.println(whichCamOff + " now off!");
	}
}



