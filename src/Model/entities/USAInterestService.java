package Model.entities;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService {

	private Double interestRate;

	public USAInterestService() {
		
	}
	
	public USAInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}
	
	//Instead of repeating this method in every class, we implement in the interface as an default method

/*	@Override
	public Double payment(double amount, int months) {
		if(months<1 ) {
			throw new InvalidParameterException("Months must be an Integer greater than 1");
		}
		return amount*Math.pow((1.0+interestRate/100),months);
	}*/ 
	
	
}
