import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Oven {
	
public Scanner scan = new Scanner(System.in); 

public  void ovenPower(String power){
	if(power.equalsIgnoreCase("on")){
		System.out.println("Please select a temperature setting (200-450°F");
		int temp = scan.nextInt();
	}
	else if(power.equalsIgnoreCase("off")){
		System.out.println("Oven is off");
	}
	else{
		System.out.println("Invalid input!");
	}
}

public void ovenTemp(int temp){
if(temp>200&& temp<450){
	System.out.println("Oven has been set to " + temp +"°F");
	
}
else{
	System.out.println("Temperature setting must be 200-450°F!");
}
}}


