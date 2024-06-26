package de.uulm.sp.swt.profcalculator;

public class Logger {
	
	public static final boolean LOGGING = true;
	
	private static Logger logger = new Logger();

	private Logger() {
		log("Logging enabled");
	}

	public void log(String message) {
		if (LOGGING) {
			System.out.println(message);
		}
	}
	
	public static Logger getLogger() {
		return logger;
	}

}
