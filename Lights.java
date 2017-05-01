import java.util.Scanner;

import javax.swing.JOptionPane;
// First I will create an object for the Jarvis server to control
public class Lights {

	private Scanner scan = new Scanner(System.in);

	public void lightsPower(String power){
		if(power.equalsIgnoreCase("on")){
			String[] b = {"Front Door", "Back Door", "Foyer", "Kitchen", "Garage", "Every Light "};

			String lightsPower = (String) JOptionPane.showInputDialog(null, "Which lights should I turn on", "Lights", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);

			lightsOn(lightsPower);
			
		}
		else if(power.equalsIgnoreCase("off")){
			
			String[] b = {"Front Door", "Back Door", "Foyer", "Kitchen", "Garage", "Every Light "};

			String lightsPowerOff = (String) JOptionPane.showInputDialog(null, "Which lights should I turn off", "Lights", JOptionPane.QUESTION_MESSAGE, null, b, b[1]);
			
	
			lightsOff(lightsPowerOff);	
		}
	 
		}
	
	public void lightsOn(String whichLights){
	
			JOptionPane.showMessageDialog(null, whichLights + " lights are now on!");
		}
	
	public void lightsOff(String whichLightsOff){
		
			
			JOptionPane.showMessageDialog(null, whichLightsOff + " lights are now off!");
	}
}
	


