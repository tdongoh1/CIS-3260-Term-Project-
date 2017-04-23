//Class for Spotify
	import java.util.Scanner;

	public class Spotify {
		private Scanner scan = new Scanner(System.in);
	public void genreName(String genre){
		if(genre.equalsIgnoreCase("pop")){
			System.out.println("Now playing pop station!");
		}

		else if(genre.equalsIgnoreCase("rock")){
				System.out.println("Now playing rock station!");
		}
		else if(genre.equalsIgnoreCase("country")){
			System.out.println("Now playing country station!");
		}
		else if(genre.equalsIgnoreCase("alternative")){
			System.out.println("alternative music is now playing!");
		}
		else {
		System.out.println("I could not find " +genre +" on Spotify!");
		
	}


		
		}


	}
