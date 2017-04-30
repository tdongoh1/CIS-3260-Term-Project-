import javax.swing.JOptionPane;

// This will be our "controller" for our various objects


public class Jarvis {
public static void main (String[] args){
Camera camera = new Camera();	
String[] options = {"Lights", "Door", "Camera", "Spotify", "Oven", "Toaster"};

String choice = (String) JOptionPane.showInputDialog(null, "What would you like to use", "Hello!", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

if (choice.equalsIgnoreCase("lights")){
	String[] v = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Lights", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("door")){
	String[] u = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Door", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}

if (choice.equalsIgnoreCase("camera")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Camera", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("spotify")){
	String[] x = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to search", "Spotify", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("oven")){
	String[] y = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Oven", JOptionPane.QUESTION_MESSAGE, null, y, y[1]);

	oven.ovenPower(power);
	
}
if (choice.equalsIgnoreCase("toaster")){
	String[] z = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Toaster", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
}
}


