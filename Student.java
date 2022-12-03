public class Student {
    String name;
    String email;

    public Student(String n, String e) {
        name = n;
        email = e;
    }

    public void printStudent() {
        System.out.println(name + " " + email);
    }

    public static void main(String[] args) {
        Student b = new Student("John Doe", "john@email.com");
        b.printStudent();
    }
}