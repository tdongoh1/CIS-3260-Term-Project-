import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Thermostat {

public  void therPower(String power){
	if(power.equalsIgnoreCase("Cooling")){
			
	int temp = Integer.parseInt(JOptionPane.showInputDialog(null,"Set a temperature for the AC (°F)", 
	"Thermostat", JOptionPane.PLAIN_MESSAGE));

	setting(temp);
  }
	else if(power.equalsIgnoreCase("Heating")){
			
	int heat = Integer.parseInt(JOptionPane.showInputDialog(null,"Set a temperature for the heater (°F)"), 
	"Thermostat", JOptionPane.PLAIN_MESSAGE));

	setting(heat);
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


