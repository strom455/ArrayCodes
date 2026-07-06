package array.practicewithfuntion3;

public class StudentSeatNumber {
	void studentSeat() {
		String student[] = { "trilok", "nandan", "ravi " };
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i] + " seat number is " + i);

		}
	}

	public static void main(String[] args) {
		StudentSeatNumber obj = new StudentSeatNumber();
		obj.studentSeat();
	}
}
