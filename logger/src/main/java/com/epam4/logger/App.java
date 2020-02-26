package com.epam4.logger;

import java.util.*;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{
	private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )throws IOException{
    	Scanner sc = new Scanner(System.in);
        logger.info("Select any Option:\n1.Interest Calculation\n2.House Construction Cost");
        int input=sc.nextInt();
  
        if(input==1) {
        	logger.info("Enter the Principle Amount : ");
        	double principleAmount = sc.nextDouble();
        	logger.info("Enter the Rate Of Interest : ");
        	double rateOfInterest = sc.nextDouble();
        	logger.info("Enter Time Taken : ");
        	double timeTaken=sc.nextDouble();
        	logger.info("Select One :\n1 Simple Interest\n2 Compound Interest");
        	int t = sc.nextInt();
        	switch(t) {
        		case(1):
        			simpleInterest si = new simpleInterest(principleAmount,timeTaken,rateOfInterest);
        			logger.info("SIMPLE INTEREST : "+ si.calculation()+"INR");
        			break;
        		case(2):
        			compoundInterest ci = new compoundInterest(principleAmount,timeTaken,rateOfInterest);
        			logger.info("COMPOUND INTEREST : "+ci.calculation()+"INR");
        			break;
        	}
        }
        else if(input==2){
        	logger.info("Enter The Area Of The House : ");
        	double area=sc.nextDouble();
        	logger.info("Select The Material Standards You Prefer: ");
        	logger.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int standard = sc.nextInt();
        	houseConstruction hc=new houseConstruction(area,standard);
        	logger.info("TOTAL COST : "+hc.total() +"INR");
        }
        else {
        	logger.info("Invalid Option");
        }

        sc.close();
    }
}