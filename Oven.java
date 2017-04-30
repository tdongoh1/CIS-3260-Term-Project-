import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Oven {
	
public Scanner scan = new Scanner(System.in); 

public  void ovenPower(String power){
	if(power.equalsIgnoreCase("on")){
			
	String t = (String)JOptionPane.showInputDialog(null,"Please select a temperature setting (200-450°F)", 
	"Oven", JOptionPane.PLAIN_MESSAGE);

	ovenTemp(t);

	}
	else if(power.equalsIgnoreCase("off")){
	   JOptionPane.showMessageDialog(null, "Oven is off", "Oven");
	}
	
}

public void ovenTemp(int temp){
if(temp>200&& temp<450){
		JOptionPane.showMessageDialog(null, "Oven has been set to " + temp +"°F", "Oven");
	
}
else{
		JOptionPane.showMessageDialog(null, "Temperature setting must be 200-450°F!", "Oven", JOptionPane.ERROR_MESSAGE);
}
}}


