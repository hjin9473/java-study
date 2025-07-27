package homework8.hw5;

public class Student {
    private String name;
    private String cname;
    
    private static int num = 1;    
    private final int studentId;    

    public Student() {
        this.studentId = num++;     
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
