package in.csm;

public class Student {
    private int    rollNo;
    private String name;

    public Student(int r, String n) { rollNo = r; name = n; }

    public void show() {
        System.out.println("Roll: " + rollNo + " | Name: " + name);
    }
}