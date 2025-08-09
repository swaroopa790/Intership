package inte.task2;
public class Student {
    private String name;
    private int rollNo;
    private String className;

    public Student() {
        
    }

    public Student(String name, int rollNo, String className) {
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
    }


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
