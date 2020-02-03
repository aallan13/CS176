
public class Invoice {

	private int hours;
	private double rate;
	private double expenses;
	private String name;
	private String estimate;
	private double hourlyCharges;
	private double TotalCharges;

	public Invoice() {

	}

	public Invoice (String inName, String inPart) {
		name = inName;
		estimate = inPart;
	}

	public void setTimeWorked(int inHours) {
		hours = inHours;
	}
	public void setExpenses(double inRate) {
		expenses = inRate;
	}
	public void setRate(double inRate) {
		rate = inRate;
	}
	public void computeLaborCharges() {
		hourlyCharges = rate*hours;
	}
	public double computeTotalCharges() {
		return TotalCharges = hourlyCharges + expenses;
	}
	public void printInvoice() {
		System.out.println("The Invoice consists of " + hours + " hours, " + expenses + " expenses, " + rate + " rate, " + TotalCharges + " charged");
	}



} 