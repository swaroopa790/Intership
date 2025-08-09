package inte.task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Subject[] subjects = null;
        ResultCalculator result = new ResultCalculator();

        int choice;
        do {
            System.out.println("\n------ Student Grade Menu ------");
            System.out.println("1. Enter Student Information");
            System.out.println("2. Enter Subjects and Marks");
            System.out.println("3. Calculate Result");
            System.out.println("4. Display Report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    student.setName(sc.nextLine());

                    System.out.print("Enter Roll Number: ");
                    student.setRollNo(Integer.parseInt(sc.nextLine()));

                    System.out.print("Enter Class Name: ");
                    student.setClassName(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    subjects = new Subject[n];

                    for (int i = 0; i < n; i++) {
                        subjects[i] = new Subject();
                        System.out.print("Enter Subject " + (i + 1) + " Name: ");
                        subjects[i].setSubjectName(sc.nextLine());

                        System.out.print("Enter marks for " + subjects[i].getSubjectName() + ": ");
                        subjects[i].setMarks(sc.nextInt());
                        sc.nextLine();
                    }
                    break;

                case 3:
                	if (subjects != null && subjects.length > 0) {
                        result.calculate(subjects);
                        System.out.println("Result calculated successfully.");
                        System.out.println("\n----- Calculation Result -----");
                        System.out.println("Total Marks : " + result.getTotal());
                        System.out.printf("Percentage  : %.2f%%\n", result.getPercentage());
                        System.out.println("Grade       : " + result.getGrade());
                    } else {
                        System.out.println("❗ Please enter subject marks first.");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Student Report -----");
                    System.out.println("Name       : " + student.getName());
                    System.out.println("Roll No    : " + student.getRollNo());
                    System.out.println("Class      : " + student.getClassName());

                    if (subjects != null) {
                        System.out.println("\nSubject-wise Marks:");
                        for (Subject s : subjects) {
                            System.out.println(s.getSubjectName() + ": " + s.getMarks());
                        }

                        System.out.println("\nTotal Marks: " + result.getTotal());
                        System.out.printf("Percentage : %.2f%%\n", result.getPercentage());
                        System.out.println("Grade      : " + result.getGrade());
                    } else {
                        System.out.println("No subject data found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }
}
