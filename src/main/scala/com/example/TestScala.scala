package com.example

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

object TestScala {
	
	var log = LogFactory.getLog(TestScala.getClass.getName);	
	
	def main(args: Array[String]): Unit = {
		println("Scala excution test...");
		
		log.info("########################");
		log.info("Testjava commons logging");
		log.info("########################");
	}
}
