package beta;

import org.apache.logging.log4j.*;

public class Demo2 {
	
	
	private static Logger log= LogManager.getLogger(Demo2.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		log.debug("login page is opened");
		log.error("logi page is not displayed");
		log.fatal("button is not shown");
		log.info("i enetered the login details");

	}

}
