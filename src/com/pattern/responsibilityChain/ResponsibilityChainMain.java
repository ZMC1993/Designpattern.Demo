package com.pattern.responsibilityChain;

public class ResponsibilityChainMain {
	public static void main(String[] args) {
		AbstractLogger logger=getAbstractLogger();
		
		logger.logMessage(logger.INFO, "info");
		logger.logMessage(logger.DEBUG, "debug info");
		logger.logMessage(logger.ERROR, "error info");
		
	}
	
	public static AbstractLogger getAbstractLogger() {
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
}
