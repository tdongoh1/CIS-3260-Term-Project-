import javax.swing.JOptionPane;

// This will be our "controller" for our various objects


public class Jarvis {
public static void main (String[] args){
Lights lights = new Lights();
Door door = new Door();
Camera camera = new Camera();
Spotify spotify = new Spotify();
Thermostat thermostat = new Thermostat();
Oven oven = new Oven();
Toaster toaster = new Toaster();
String[] options = {"Lights", "Door", "Camera", "Thermostat" "Spotify", "Oven", "Toaster"};

String choice = (String) JOptionPane.showInputDialog(null, "What can I help you with", "Hello!", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

if (choice.equalsIgnoreCase("lights")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Lights", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	lights.lightsPower(power);
	
}
if (choice.equalsIgnoreCase("door")){
	String[] a = {"Unlock", "Lock"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Door", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	door.doorPower(power);
	
}

if (choice.equalsIgnoreCase("camera")){
	String[] a = {"turn a camera on", "turn a camera off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Camera", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	camera.camPower(power);
	
}
if (choice.equalsIgnoreCase("spotify")){
	
 	String[] searches = {"Genres", "Artists", "Songs", "Playlists"};
 
 	String search = (String) JOptionPane.showInputDialog(null, "What would you like to search", "Spotify", JOptionPane.QUESTION_MESSAGE, null, searches, searches[1]);
 
 	spotify.doSearch(search);
	
}
if (choice.equalsIgnoreCase("oven")){
	String[] a = {"turn the oven on", "turn the oven off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Oven", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);
	oven.ovenPower(power);
}

if (choice.equalsIgnoreCase("thermostat")){
	String[] a = {"heating", "cooling", "turn off the thermostat"};
	
	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Thermostat", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);
	
	thermostat.therPower(power);
}
if (choice.equalsIgnoreCase("toaster")){
	String[] a = {"On", "Off"};

	String power = (String) JOptionPane.showInputDialog(null, "What would you like to do", "Toaster", JOptionPane.QUESTION_MESSAGE, null, a, a[1]);

	toaster.toasterPower(power);
	
}
}
}
