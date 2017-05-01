import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Thermostat {

public  void therPower(String power){
	if(power.equalsIgnoreCase("Cooling") || power.equalsIgnoreCase("Heating")){
			
	int t = Integer.parseInt(JOptionPane.showInputDialog(null,"What would you like me to set the temperature to?", 
		"Thermostat", JOptionPane.PLAIN_MESSAGE));
	setting(temp);
  }


	else if(power.equalsIgnoreCase("turn off the thermostat")){
	   JOptionPane.showMessageDialog(null, "The thermostat is off!");
	}
	
}

public void setting(int t){
if(t>50 && t<90){
		JOptionPane.showMessageDialog(null, "Thermostat has been set to" + t +"°F");
	
}
else{
		JOptionPane.showMessageDialog(null, "Please select a temperature between 50-90°F!");
}
}}


