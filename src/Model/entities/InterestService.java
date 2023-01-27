package Model.entities;

import java.security.InvalidParameterException;

public interface InterestService {

	Double getInterestRate(); //Note that we cannot implement this method as default since the interface does not have access to the interestRate parameter
	
	default Double payment(double amount, int months) {
		if(months<1 ) {
			throw new InvalidParameterException("Months must be an Integer greater than 1");
		}
		return amount*Math.pow((1.0+this.getInterestRate()/100),months);
}
	
}
