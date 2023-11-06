package javacodechecker;






import org.apache.logging.log4j.Logger;

public class SensitiveInfoLogged {
	private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(SensitiveInfoLogged.class);

	public void performSomeAction(String password) {        
		// EMB-ISSUE: CodeIssueNames.SENSITIVE_INFO_LOGGED 
		logger.info("Password is " + password);
	}

	public void infoLogging(String password) {
		// EMB-ISSUE: CodeIssueNames.SENSITIVE_INFO_LOGGED/no-detect
		logger.info("Password is " + p);
	}

	public void infoNotLogged(String password) {
		// EMB-ISSUE: CodeIssueNames.SENSITIVE_INFO_LOGGED/no-detect
		logger.info("Password is not logged");
	}

}
