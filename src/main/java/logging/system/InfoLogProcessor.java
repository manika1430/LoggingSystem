package logging.system;

public class InfoLogProcessor extends LoggingProcessor {
	

	InfoLogProcessor(LoggingProcessor nextProcessor) {
		super(nextProcessor);
	}
	
	public void log(Integer logLevel, String message) {
		if(logLevel==INFO) {
			System.out.println("INFO: "+message);
		}else {
			super.log(logLevel, message);
		}
		
	}

}
