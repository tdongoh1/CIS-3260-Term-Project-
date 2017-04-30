import java.util.Scanner;


import java.util.Scanner ;
public class Toaster {
	Scanner input = new Scanner (System.in);
	
	// instance field
		private int defaultMinutes;
		private boolean toasterOn;
		
		// Constructors
		// create a new toaster
		public Toaster () {
			defaultMinutes = 2;
			toasterOn = false ;
		}
		// Methods
			
		public int getDefaultMinutes() {
			return defaultMinutes ;
		}
		
		public void setDefaultMinutes() {
			this.defaultMinutes = defaultMinutes ;
			
		}
		
		public boolean isToaasterOn () {
			return toasterOn ;
			
		}
	  public void setToasterOn ( boolean toasterOn){
		  this.toasterOn = toasterOn ;
		  
	  }
	  
	  // start toaster with default timing 
	  public void startToaster () {
		  toasterOn = true ;
		  System.out.println(" Toasting for " + defaultMinutes + " minutes");
		  System.out.println(" Toasting is done ! Toasting is done !");
		  
		  
		  
		  }
		  
		  // Start toaster with user input 
		  
		  public void startToaster ( int minutes){
			  minutes = input.nextInt();  
			  if ( minutes > 1 || minutes < 6 ){
				  System.out.println(" Toaster is on");
				  
			  }
			  else {
				  System.out.println(" User inputted time limit is out of bounds."
				  		+ "Please enter time (in minutes) between 1 -6 "  );
				  				return; 
			  }
	  }
	  // stop toaster 
	  public void stopToaster() {
		  toasterOn = false ;
		  System.out.println(" Toastering session has ended");
	  }
	  

}
