import java.util.Scanner; 

import javax.swing.JOptionPane;

public class Toaster {
	public Scanner scan = new Scanner(System.in); 

	public  void toasterPower(String power){
		if(power.equalsIgnoreCase("on")){
				
		String m = (String)JOptionPane.showInputDialog(null,"Please enter a time setting (1-6 minutes)", 
		"Toaster", JOptionPane.PLAIN_MESSAGE);
		toasterMinutes(m);
		
		}
		else if(power.equalsIgnoreCase("off")){
		   JOptionPane.showMessageDialog(null, "Toaster is off", "Toaster",0);
		}
		
	}

	public void toasterMinutes(int minutes){
	if(minutes > 1 && minutes < 6){
		
			JOptionPane.showMessageDialog(null, "Toaster has been set to " + minutes);
		
	}
	else{
			JOptionPane.showMessageDialog(null, "User inputted time minutes is out of bound. Please enter time between 1-6");
	}
	}
}
