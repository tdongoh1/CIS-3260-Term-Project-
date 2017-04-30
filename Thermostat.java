import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Thermostat {
	
public Scanner scan = new Scanner(System.in); 

public  void therPower(String power){
	if(power.equalsIgnoreCase("Cooling")){
			
	String t = (String)JOptionPane.showInputDialog(null,"Set a temperature for the AC (°F)", 
	"Thermostat", JOptionPane.PLAIN_MESSAGE);

	tTemp(t);
  }
	else if(power.equalsIgnoreCase("Heating")){
			
	String t = (String)JOptionPane.showInputDialog(null,"Set a temperature for the heater (°F)"), 
	"Thermostat", JOptionPane.PLAIN_MESSAGE);

	tTemp(t);
	}
	else if(power.equalsIgnoreCase("off")){
	   JOptionPane.showMessageDialog(null, "The thermostat is off!");
	}
	
}

public void tTemp(int temp){
if(temp>200&& temp<450){
		JOptionPane.showMessageDialog(null, "Thermostat has been set to" + temp +"°F", "Thermostat");
	
}
else{
		JOptionPane.showMessageDialog(null, "Please select a temperature between 50-90°F!", "Thermostat", JOptionPane.ERROR_MESSAGE);
}
}}


