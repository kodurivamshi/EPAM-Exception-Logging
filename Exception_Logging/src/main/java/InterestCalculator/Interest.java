package InterestCalculator;

public abstract class Interest {
	private double amount,years,rateOfInterest;
	
	public void setter(double principal,double year,double rate) {
		this.amount=principal;
		this.rateOfInterest=rate;
		this.years=year;
	}
	
	public double getAmount() {
		return this.amount;
	}
	public double getYear() {
		return this.years;
	}
	public double getRateofInterest()
	{
		return this.rateOfInterest;
	}
}
