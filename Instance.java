package pack_two;
import pack_one.Course;

public class Instance {
    public static void main(String[] args) {
        Student me = new Student(2022310904, "马同学", "MAN");
        System.out.println("学生信息");
        System.out.println(me);
        Teacher b = new Teacher(01, "师老师", "WOMAN", "线性代数");
        System.out.println("教师信息");
        System.out.println(b);
        me.delete();
        Course c = new Course("线性代数", 17, "207", "8:00-9:40", 5);
        System.out.println(c);

    }
}