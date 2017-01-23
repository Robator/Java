package salary;

public class main {

	public static void main(String[] args) {
		int base_pay = 8;
		int worked_hours = 1;
		if (worked_hours > 60) {
			System.out.println("Too many working hours...switching to max 60 hours...");
			worked_hours = 60;
		}
		double salary = base_pay * (worked_hours - worked_hours / 40 * (worked_hours - 40));
		if (worked_hours > 40) {
			salary += 1.5 * base_pay * (worked_hours - 40);
		}
		System.out.println("Salary per " + worked_hours + " hours is " + salary + "$");
	}

}
