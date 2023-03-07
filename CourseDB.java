package com.coursemanagement;

import java.util.Scanner;

public class CourseDB {
	static Scanner sc = new Scanner(System.in);
	static int num = 0;

	public void addCourse(Course c) {
		System.out.print("Enter Course ID: ");
		c.setCId(sc.nextInt());
		System.out.print("Enter Course Name: ");
		c.setCName(sc.next());
		System.out.print("Enter Course Fee: ");
		c.setCfee(sc.nextDouble());
		System.out.println("Course added successfully.");
	}

	public void updateCourse(Course c[], int cId) {
		for (int i = 0; i < num; i++) {
			if (c[i].getCId() == cId) {
				System.out.println(c[i].getCName() + "  " + c[i].getCfee());
				System.out.print("Enter Course Name: ");
				String cName = sc.next();
				c[i].setCName(cName);
				System.out.print("Enter Course Fee: ");
				double cfee = sc.nextDouble();
				c[i].setCfee(cfee);
				System.out.println("Course updated successfully.");
				break;

			}
		}
		System.out.println("Course not found.");
	}

	public void deleteCourse(Course[] c, int cId) {
		boolean flag = false;
		for (int i = 0; i < num; i++) {
			if (c[i].getCId() == cId) {
				flag = true;
				System.out.println(c[i].getCId() + " " + c[i].getCName() + " " + c[i].getCfee());
				for (int j = i; j < num - 1; j++) {
					c[j] = c[j + 1];
				}
				c[num - 1] = null;
				if (!flag) {
					System.out.println("Course Not Found");
				}
				break;
			}
		}
	}

	public void viewCourses(Course c1[]) {
		for (int i = 0; i < num; i++) {
			System.out.println(c1[i]);
		}
	}

	public void displayCourseById(Course c[], int cId) {
		boolean flag = false;
		for (int i = 0; i < num; i++) {
			if (c[i].getCId() == cId) {
				flag = true;
				System.out.println(c[i].toString());
				if (!flag) {
					System.out.println("Course not found.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseDB db1 = new CourseDB();
		Course[] c = new Course[5];

		int choice;
		do {

			System.out.println("Course  Menu");
			System.out.println("1. Add Course");
			System.out.println("2. Update Course");
			System.out.println("3. Delete Course");
			System.out.println("4. View Courses");
			System.out.println("5. Display Course by ID");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (num < c.length) {
					c[num] = new Course(choice, null, choice);
					db1.addCourse(c[num]);
					num++;
				} else {
					System.out.println("you have already added maximum courses");
				}

				break;
			case 2:
				System.out.println("Enter Course Id to Update The Course:-");
				int cId = sc.nextInt();
				db1.updateCourse(c, cId);
				System.out.println("Course updated Sucessfully.......!!");
				break;
			case 3:
				System.out.println("Enter Course Id to Delete Course:-");
				int cId1 = sc.nextInt();
				db1.deleteCourse(c, cId1);
				System.out.println("Course deleted Successfully.......!!");
				break;
			case 4:
				db1.viewCourses(c);
				break;
			case 5:
				System.out.println("Enter Course Id to Display Course by ID:-");
				int cid = sc.nextInt();
				db1.displayCourseById(c, cid);
				System.out.println("Displayed Course by ID Successfully........!!");
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			}
			System.out.println("Do you want to perform more operation Yes-1/No-0");
			choice = sc.nextInt();
		} while (choice != 0);
	}
}
