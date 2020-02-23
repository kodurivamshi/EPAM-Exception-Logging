package InterestCalculator;

public class SimpleInterest extends Interest {
	SimpleInterest(double amount,double rateofinterest,double year){
		super.setter(amount,rateofinterest,year);
	}
	
	public double Simpleinterest() {
		double interestcalculated=(super.getAmount()*super.getRateofInterest()*super.getYear())/100;
		
		return interestcalculated;
	}
}
