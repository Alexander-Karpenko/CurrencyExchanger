package currencyExchanger;

public class CurrencyExchangerMetods {
	
	private double inputValue;
	
	private double outputValue;
	
	Currency inputCurrency;
	
	Currency outputCurrency;
	
	public CurrencyExchangerMetods() {
		
	}

	public CurrencyExchangerMetods(Currency inputCurrency, Currency outputCurrency) {
		this.inputCurrency = inputCurrency;
		this.outputCurrency = outputCurrency;
	}

	public void Exchange() {
		double coefficient = outputCurrency.getDenomination() / inputCurrency.getDenomination() ;
		outputValue = inputValue * coefficient;
	}
	
	public void setInputValue(double inputValue) {
		this.inputValue = inputValue;
	}
	
	public double getOutputValue() {
		return outputValue;
	}

	public Currency getCurrency() {
		return inputCurrency;
	}

	public void setInputCurrency(Currency currency) {
		this.inputCurrency = currency;
	}

	public Currency getOutputCurrency() {
		return outputCurrency;
	}

	public void setOutputCurrency(Currency outputCurrency) {
		this.outputCurrency = outputCurrency;
	}
	
	

}
