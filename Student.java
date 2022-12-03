public class Student {
    String name;
    String email;
    int grade;

    public Student(String n, String e, int g) {
        name = n;
        email = e;
        grade = g;
    }

    public void printStudent() {
        System.out.println(name + " " + email + " " + grade);
    }

    public static void main(String[] args) {
        Student b = new Student("John Doe", "john@gmail.com", 9);
        b.printStudent();
    }
}