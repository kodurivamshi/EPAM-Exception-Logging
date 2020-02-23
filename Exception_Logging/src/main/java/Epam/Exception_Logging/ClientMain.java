package Epam.Exception_Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import HouseConstructionCostEstimator.Houseconstructioncostestimator;
import InterestCalculator.CalculateInterest;

public class ClientMain {
	
	public static Logger LOGGER = LogManager.getLogger(ClientMain.class); 
	public static void main(String[] args) {
		
		LOGGER.info("MAIN method Executing...");
		
		LOGGER.info("House Construction Cost Estimatior (module) executing...");
		
		Houseconstructioncostestimator houseconstructioncostestimate=new Houseconstructioncostestimator();
		
		LOGGER.info("Simple & compound Interest Calculator (module) executing...");
		
		CalculateInterest interestCalculator=new CalculateInterest();
		
	}

}
