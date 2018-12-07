package stringModification;

import java.util.Scanner;

public class StudentInfo {
	int id;
	String name;
	double per;

	public StudentInfo(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	void display() {
		System.out.println(this.id + " " + this.name + " " + this.per);
	}

	public static void main(String[] args) {
		System.out.println("Enter the total no of student..");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StudentInfo[] si = new StudentInfo[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the ID, NAME, PER for the " + (i + 1) + " Student");
			int id = sc.nextInt();
			String name = sc.next();
			double per = sc.nextDouble();
			si[i] = new StudentInfo(id, name, per);
		}
		System.out.println("Entered Student info is :");
		for (int i = 0; i < si.length; i++) {
			si[i].display();
		}
		sc.close();
		StudentInfo hs = si[0];
		for (int i = 0; i < si.length; i++) {
			if (hs.per < si[i].per) {
				hs = si[i];
			}
		}
		System.out.println("Higest Score Student is ");
		hs.display();
	}
}
