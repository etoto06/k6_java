package J07;

abstract class InterfaceStudents {
    public abstract void showObject();
}

class Student extends InterfaceStudents {
    static int countStudents; // 객체수
    int sid; // 학번
    String sname; // 학생 이름
    String city; // 주소 도시

    public Student() {
        countStudents++;
    }

    public Student(int sid) {
        this.sid = sid;
        countStudents++;
    }

    public String toString() {
        return "sid=" + sid + ", sname=" + sname + ", city=" + city;
    }

    public void showObject() {
        System.out.println("[" + sid + ", " + sname + ", " + city + "]");
    }

    static void showNumberObjects() {
        System.out.println("생성객체수=" + countStudents);
    }
}

class WorkStudent extends Student {
    String eno;
    String company;

    public String toString() {
        return super.toString() + ", eno=" + eno + ", company=" + company;
    }

    public void showObject() {
        super.showObject();
        System.out.println("[" + eno + ", " + company + "]");
    }
}

class CodingWorkStudent extends WorkStudent {
    String language;

    public String toString() {
        return super.toString() + ", language=" + language;
    }

    public void showObject() {
        super.showObject();
        System.out.println("[" + language + "]");
    }
}

public class JavaHome07object{
    static void showObjects(InterfaceStudents is) {
        is.showObject();
    }

    public static void main(String[] args) {
        Student arry[] = new Student[5];
        Student.showNumberObjects();

        arry[0] = new Student();
        arry[1] = new Student(202301);
        arry[2] = new WorkStudent();
        arry[3] = new CodingWorkStudent();
        arry[4] = new WorkStudent();

        Student.showNumberObjects();

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != null) {
                System.out.println(arry[i].toString());
            }
        }

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != null) {
                showObjects(arry[i]);
            }
        }

    }
}
