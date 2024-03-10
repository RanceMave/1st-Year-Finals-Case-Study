import java.util.Scanner;

public class Student {
    private int studentID;
    private final String status;
    private char gender;
    private double assist;
    private char level;

    public Student(String status) {
        this.status = status;
        setAssist();
    }
    
    private char getValidGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student gender (M/F): ");
        char gender = scanner.nextLine().charAt(0);
        return Character.toUpperCase(gender);
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender input. Please enter 'M' for MALE or 'F' for FEMALE.");
            setGender(getValidGender());
        }
    }

    

    public char getGender() {
        return gender;
    }

    public void setLevel(char level) {
        if (level >= '1' && level <= '5') {
            this.level = level;
            setAssist();
        } else {
            System.out.println("Invalid level input. Please enter a level between '1' and '5'.");
            setLevel(getValidLevel());
        }
    }

    private char getValidLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student level (1-5): ");
        char level = scanner.nextLine().charAt(0);
        return level;
    }

    public char getLevel() {
        return level;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getAssist() {
        return assist;
    }

    private void setAssist() {
        switch (level) {
            case '1':
                assist = 100.0;
                break;
            case '2':
                assist = 150.0;
                break;
            case '3':
                assist = 200.0;
                break;
            case '4':
                assist = 250.0;
                break;
            case '5':
                assist = 300.0;
                break;
            default:
                assist = 0.0;
                break;
        }
    }

    public void print() {
        String genderWord = "";
        switch (gender) {
            case 'M':
                genderWord = "Male";
                break;
            case 'F':
                genderWord = "Female";
                break;
        }
        String levelWord = "";
        switch (level) {
            case '1':
                levelWord = "Freshman";
                break;
            case '2':
                levelWord = "Sophomore";
                break;
            case '3':
                levelWord = "Junior";
                break;
            case '4':
                levelWord = "Senior";
                break;
            case '5':
                levelWord = "Fifth Year and Beyond";
                break;
        }
        System.out.println("Student ID: " + studentID);
        System.out.println("Status: " + status);
        System.out.println("Gender: " + genderWord);
        System.out.println("Level: " + levelWord);
        System.out.println("Assist: P" + assist + "\n");
    }
}
