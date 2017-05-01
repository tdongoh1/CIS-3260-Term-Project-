//Class for Spotify
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Spotify {
	private Scanner scan = new Scanner(System.in);
	
public void doSearch(String search){
	if(search.equalsIgnoreCase("genres"))
		{
		String[] genresChoices = {"Pop", "Rock", "Alternative", "Country", "Hip Hop"};

		String gen = (String) JOptionPane.showInputDialog(null, "Select a genre", "Spotify", JOptionPane.PLAIN_MESSAGE, null, genreChoices, genreChoices[1]);
			 
		JOptionPane.showMessageDialog(null, "Ok,"+ gen +" Station is playing!");
				
		}
	else if(search.equalsIgnoreCase("artists"))
		{
		String artist = (String)JOptionPane.showInputDialog(null,"Which artist would you like to search for", 
	 	"Spotify", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Ok,"+ artist +"'s top hits are now playing!");
		}
	else if(search.equalsIgnoreCase("songs"))
		{
		String song = (String)JOptionPane.showInputDialog(null,"Which song would you like to search for", 
	 	"Spotify", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Ok,"+ song +" is now playing!");
		}
	else if(search.equalsIgnoreCase("Playlists"))
		{
		String[] g = {"Current Favorites", "Happy Songs", "Workout Track", "Sad :(", "2015", "Dance"};

		String play = (String) JOptionPane.showInputDialog(null, "Select a playlist", "Spotify", JOptionPane.PLAIN_MESSAGE, null, g, g[1]);

		JOptionPane.showMessageDialog(null, "Ok,"+ play +"  is now playing!");
				
		}
	
		}
	}
