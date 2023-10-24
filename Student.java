package pack_two;
import pack_one.Person;

public class Student extends Person{
    public Student(int number, String name,String sex) {
        super(number,name,sex);
        this.number = number;
        this.name = name;
        this.sex = sex;
    }
    
    public String toString(){
        return "Student(学生信息):  姓名：" + name
                + "    学号：" + number + "   性别：" + sex ;
    }
    
    void delete() {
            System.out.println("学生选课信息为：");
            }

}