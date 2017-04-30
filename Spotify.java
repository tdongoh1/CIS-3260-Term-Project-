//Class for Spotify
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Spotify {
	private Scanner scan = new Scanner(System.in);
	
public void doSearch(String search){
	if(search.equalsIgnoreCase("genres"))
		{
		String[] x = {"Go Back", "Pop", "Rock", "Alternative", "Country", "Hip Hop"};

		String gen = (String) JOptionPane.showInputDialog(null, "Select a genre, or go back", "Spotify", JOptionPane.PLAIN_MESSAGE, null, x, x[1]);

			if(gen.equalsIgnoreCase("go back"))
				{
			String[] x = {"Genres", "Artists", "Songs", "Playlists"};
			String se = (String) JOptionPane.showInputDialog(null, "What would you like to search", "Spotify", JOptionPane.QUESTION_MESSAGE, null, x, x[1]);
			spotify.doSearch(se);
				}
			else 
				{
			JOptionPane.showMessageDialog(null, "Ok,"+ gen +" Station is playing!", "Spotify");
				}
		}
	else if(search.equalsIgnoreCase("artists"))
		{
		String artist = (String)JOptionPane.showInputDialog(null,"Which artist would you like to search for", 
	 	"Spotify", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Ok,"+ artist +"'s top hits are now playing!", "Spotify");
		}
	else if(genre.equalsIgnoreCase("songs"))
		{
		String song = (String)JOptionPane.showInputDialog(null,"Which song would you like to search for", 
	 	"Spotify", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Ok,"+ song +" is now playing!", "Spotify");
		}
	else if(genre.equalsIgnoreCase("Playlists"))
		{
		String[] g = {"Current Favorites", "Happy Songs", "Workout Track", "Sad :(", "2015", "Dance"};

		String play = (String) JOptionPane.showInputDialog(null, "Select a playlist, or go back", "Spotify", JOptionPane.PLAIN_MESSAGE, null, g, g[1]);

			if(gen.equalsIgnoreCase("go back"))
				{
			String[] x = {"Genres", "Artists", "Songs", "Playlists"};
			String se = (String) JOptionPane.showInputDialog(null, "What would you like to search", "Spotify", JOptionPane.QUESTION_MESSAGE, null, x, x[1]);
			spotify.doSearch(se);
				}
			else 
				{
			JOptionPane.showMessageDialog(null, "Ok,"+ play +"  is now playing!", "Spotify");
				}
		}
	
		}
	}
