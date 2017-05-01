import java.util.Scanner;

import javax.swing.JOptionPane;


public class Camera{ 
private Scanner scan = new Scanner(System.in);

	public void camPower(String power){
		if(power.equalsIgnoreCase("turn a camera on")){
			String[] b = {"All cameras","Front Door camera", "Back Door camera", "Foyer camera", "Kitchen camera", "Garage camera"};

			String whichCam = (String) JOptionPane.showInputDialog(null, "Which camera should I turn on", "Camera", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);

			camOn(whichCam);
			
		}
		else if(power.equalsIgnoreCase("turn a camera off")){
			
			String[] b = {"All cameras", "Front Door camera", "Back Door camera", "Foyer camera", "Kitchen camera", "Garage camera"};

			String whichCamOff = (String) JOptionPane.showInputDialog(null, "Which camera should I turn off", "Camera", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);
			
	
			camOff(whichCamOff);	
		}
	 
		}
	
	public void camOn(String whichCam){
	
			JOptionPane.showMessageDialog(null, whichCam + " now on!", "Camera", null );
		}
	
	public void camOff(String whichCamOff){
		
			JOptionPane.showMessageDialog(null, whichCamOff + " now off!", "Camera", null);
	}
}



