
public class App {

	public static void main(String[] args) {
		 
		//Asterisk Logger
		
		Logger asteriskLog = new AsteriskLogger();
		
		asteriskLog.log("A Perfect Circle");
		
		Logger asteriskError = new AsteriskLogger();
		
		asteriskError.error("Take a Deep Breathe");
		
		//Spaced Logger
		
		Logger spacedLog = new SpacedLogger();
		
		spacedLog.log("Promineo Tech");
		
		Logger spacedError = new SpacedLogger();
		
		spacedError.error("Grab a Hammer");

	}

}
