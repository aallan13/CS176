
import java.util.Scanner;

public class InvoiceTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Invoice A = new Invoice();

		A.setTimeWorked(4);
		A.setExpenses(50);
		A.setRate(15);
		A.computeLaborCharges();
		A.printInvoice();

		System.out.println("What is the name of the customer? ");
		String x = in.next();

		System.out.println(x + "'s total charges: " + A.computeTotalCharges());







	}


}

