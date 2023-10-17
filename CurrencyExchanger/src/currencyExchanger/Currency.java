package currencyExchanger;

public enum Currency {
	DOLLARS(1), RUBLES(100.3), TENGE(477.5);
	
	private double denomination;
	
	Currency (double denomination) {
		this.denomination =  denomination;
	}

	public double getDenomination() {
		return denomination;
	}
	 	 
	
}
