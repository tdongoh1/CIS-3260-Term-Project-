import javax.swing.JOptionPane;

// This will be our "controller" for our various objects


public class Jarvis {
public static void main (String[] args){
Camera camera = new Camera();	
String[] options = {"Lights", "Door", "Camera", "Spotify", "Oven", "Toaster"};

String choice = (String) JOptionPane.showInputDialog(null, "What would you like to use", "Hello!", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

if (choice.equalsIgnoreCase("lights")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Lights", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("door")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Door", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}

if (choice.equalsIgnoreCase("camera")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Camera", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("spotify")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Spotify", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("oven")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Oven", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("toaster")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Toaster", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
}
}


