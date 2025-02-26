package logging.system;

public class ErrorLogProcessor extends LoggingProcessor{

	ErrorLogProcessor(LoggingProcessor nextProcessor) {
		super(nextProcessor);
	}
	
	public void log(Integer logLevel, String message) {
		if(logLevel==ERROR) {
			System.out.println("ERROR: "+ message);
		}else {
			super.log(logLevel, message);
		}
	}

}
