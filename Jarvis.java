import javax.swing.JOptionPane;

// This will be our "controller" for our various objects


public class Jarvis {
public static void main (String[] args){
Lights lights =new Lights();
Door door = new door();
Camera camera = new Camera();
Spotify spotify = new Spotify();
Thermostat thermostat = new Thermostat();
Oven oven = new Oven();
Toaster toaster = new Toaster();
//i added the user line so they interface would use their name in the title - if this doesn't work you can just take it out
String[] options = {"Lights", "Door", "Camera", "Spotify", "Oven", "Toaster"};

String choice = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Hello!" , JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

if (choice.equalsIgnoreCase("lights")){
	String[] v = {"Turn the lights On", "Turn the lights Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Lights", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("door")){
	String[] u = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Door", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}

if (choice.equalsIgnoreCase("camera")){
	String[] a = {"Turn a camera On", "Turn a camera Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Camera", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("spotify")){
	String[] x = {"Genres", "Artists", "Songs", "Playlists"};

	String search = (String) JOptionPane.showInputDialog(null, "What would you like to search", "Spotify", JOptionPane.QUESTION_MESSAGE, null, x, x[1]);

	spotify.doSearch(search);
	
}
if (choice.equalsIgnoreCase("thermostat"){
	String[] x = {"Heating", "Cooling", "Turn off Thermostat"};

	String power = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Thermostat", JOptionPane.QUESTION_MESSAGE, null, x, x[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("oven")){
	String[] y = {"Turn the oven On", "Turn the oven Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Oven", JOptionPane.QUESTION_MESSAGE, null, y, y[1]);

	oven.ovenPower(power);
	
}
if (choice.equalsIgnoreCase("toaster")){
	String[] z = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Toaster", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
}
}


