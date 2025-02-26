package logging.system;

public class DebugLogProcessor extends LoggingProcessor{

	DebugLogProcessor(LoggingProcessor nextProcessor) {
		super(nextProcessor);
	}
	
	public void log(Integer logLevel, String message) {
		if(logLevel==DEBUG) {
			System.out.println("DEBUG: "+ message);
		}else {
			super.log(logLevel, message);
		}
	}

}
