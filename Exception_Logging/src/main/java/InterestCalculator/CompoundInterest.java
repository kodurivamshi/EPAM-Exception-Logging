package InterestCalculator;

public class CompoundInterest extends Interest{
	CompoundInterest(double amount,double rateofinterest,double year){
		super.setter(amount,rateofinterest,year);
	}
	public double Compoundinterest() {
		double interestcalculated=super.getAmount()*Math.pow(1.0+super.getRateofInterest()/100.0,super.getYear())-super.getAmount();
		
		return interestcalculated;
	}

}
