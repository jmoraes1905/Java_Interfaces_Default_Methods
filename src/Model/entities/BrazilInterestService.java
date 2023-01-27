package Model.entities;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

	private Double interestRate;

	public BrazilInterestService() {
		
	}
	
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}

/*	@Override
	public Double payment(double amount, int months) {
		if(months<1 ) {
			throw new InvalidParameterException("Months must be an Integer greater than 1");
		}
		return amount*Math.pow((1.0+interestRate/100),months);
	}*/
	
	
}
