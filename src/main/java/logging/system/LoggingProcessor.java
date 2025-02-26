package logging.system;

public class LoggingProcessor {
	
	public static int ERROR=0;
	public static int INFO=1;
	public static int DEBUG=2;
	
	LoggingProcessor nextProcessor;
	
	LoggingProcessor(LoggingProcessor nextProcessor){
		this.nextProcessor=nextProcessor;
	}
	
	public void log(Integer logLevel, String message) {
		if(nextProcessor!=null) {
			nextProcessor.log(logLevel, message);
		}else {
			System.out.println("This log level cannot be processed");
		}
	}
}
