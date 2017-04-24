


import java.util.Scanner;

public class Toaster {
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
  
	  
	  
	  
	  
  
  
}
