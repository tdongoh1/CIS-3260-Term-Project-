import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Thermostat {

public  void therPower(String power){
	if(power.equalsIgnoreCase("Cooling")){
			
	String t = (String)JOptionPane.showInputDialog(null,"Set a temperature for the AC (°F)", 
	"Thermostat", JOptionPane.PLAIN_MESSAGE);

	setting(t);
  }
	else if(power.equalsIgnoreCase("Heating")){
			
	String t = (String)JOptionPane.showInputDialog(null,"Set a temperature for the heater (°F)"), 
	"Thermostat", JOptionPane.PLAIN_MESSAGE);

	setting(t);
	}
	else if(power.equalsIgnoreCase("turn off the thermostat")){
	   JOptionPane.showMessageDialog(null, "The thermostat is off!", "Thermostat");
	}
	
}

public void setting(int t){
if(t>50 && t<90){
		JOptionPane.showMessageDialog(null, "Thermostat has been set to" + t +"°F", "Thermostat", null);
	
}
else{
		JOptionPane.showMessageDialog(null, "Please select a temperature between 50-90°F!", "Thermostat", null);
}
}}


