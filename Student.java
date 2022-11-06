public class Student {
    String name;
    int grade;

    public Student(String n, int g) {
        name = n;
        grade = g;
    }

    public void printStudent() {
        System.out.println(name + " " + grade);
    }

    public static void main(String[] args) {
        Student b = new Student("Jhon Doe", 9);
        b.printStudent();
    }
}