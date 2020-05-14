package alpha;

import org.apache.logging.log4j.*;


public class Demo1 {
	
	
	
	private static final Logger log1=  LogManager.getLogger(Demo1.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log1.debug("login page is opened");
		log1.error("logi page is not displayed");
		log1.fatal("button is not shown");
		log1.info("i enetered the login details");

	}

}
