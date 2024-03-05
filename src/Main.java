import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");

        while (true) {
            System.out.print("Enter student ID (e.g., 001): ");
            String studentID = scanner.next();
            System.out.print("Enter student name: ");
            String studentName = scanner.next();
            System.out.print("Enter number of extra activities: ");
            int totalExtraActivities = scanner.nextInt();

            Student student = new Student(studentID, studentName, totalExtraActivities);

            for (int i = 0; i < totalExtraActivities; i++) {
                System.out.print("Enter extra activity " + (i + 1) + ": ");
                student.addExtraActivity(i, scanner.next());
            }

            System.out.println("Student details:\n" + student);

            System.out.print("Do you want to enter details for another student? (Y/N): ");
            String continueInput = scanner.next();

            if (!continueInput.equalsIgnoreCase("Y")) {
                break;
            }
        }

        scanner.close();
    }
}