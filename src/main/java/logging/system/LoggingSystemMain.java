package logging.system;

public class LoggingSystemMain {
	
	public static void main(String[] args) {
		LoggingProcessor logger= new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));
		
		logger.log(LoggingProcessor.INFO, "Logging info ");
		logger.log(LoggingProcessor.ERROR, "Logging error ");
		logger.log(LoggingProcessor.DEBUG, "Logging debug ");

	}

}
