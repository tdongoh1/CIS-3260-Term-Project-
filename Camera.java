import java.util.Scanner;


public class Camera{ 
private Scanner scan = new Scanner(System.in);

	public void camPower(String power){
		if(power.equalsIgnoreCase("on")){
			System.out.println("Which camera should I turn on?");
			String camPower = scan.nextLine();
			camOn(camPower);
			
		}
		else if(power.equalsIgnoreCase("off")){
			System.out.println("Which camera should I turn off?");
			String camPowerOff = scan.nextLine();
			camOff(camPowerOff);	
		}
		else{
			System.out.println("I'm sorry, I don't understand!");
	
		}
	}
	public void camOn(String whichCam){
	
			System.out.println(whichCam +" is now on!" );
		}
	
	public void camOff(String whichCamOff){
		
				System.out.println(whichCamOff+ " is now off!");
	}
}