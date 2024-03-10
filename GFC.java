import java.util.Scanner;

public class GFC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student status (Regular/Irregular): ");
        String status = scanner.nextLine();

        while (true) {        
            if (!status.equals("Regular") && !status.equals("Irregular")) {
                System.out.println("Invalid status input. Please enter either 'Regular' or 'Irregular'.");
                continue;
            }
            
        Student student = new Student(status);
        System.out.print("Enter student gender (M/F): ");
        char gender = Character.toUpperCase(scanner.nextLine().charAt(0));
        student.setGender(gender);
        System.out.print("Enter student level (1-5): ");
        char level = scanner.nextLine().charAt(0);
        student.setLevel(level);
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        student.setStudentID(studentID);
        System.out.println("");
        student.print();
        scanner.nextLine();
        }
    }
}