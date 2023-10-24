# 实验三：基于继承关系改进学生选课模拟系统

# 实验目的：

	掌握权限访问控制修饰符的使用；
 	掌握继承的使用。

# 业务要求：

    1.保持实验二的代码和readme版本不变；
    2.新建代码仓库，在实验二代码的基础上完成本次实验；
    3.业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义，探讨该系统中哪些类具有共性，作为父类，定义子类；
    4.父类定义构造方法，子类定义构造方法，掌握super()用法；
    5.基础对象类和测试类分别存放于不同的package中，验证权限访问控制、继承后属性及方法的可见性。

# 过程：

    建立一个名为pack_one的包里面包含Course和Person，这两个类作为父类，再建立一个名为pack_two的包内含有Students和Teacher、Instance，这三类作为子类。

# 核心代码：

Course类

    public class Course {
	    public int id;
	    public String Coursename;
	    public String place;
	    public String time;
	    public float credit;}
     
Person类

    public class Person {
	    public int number;
	    public String name;
	    public String sex;}

上述两类作为父类

Student类

    public class Student extends Person{
        public Student(int number, String name,String sex) {
            super(number,name,sex);
            this.number = number;
            this.name = name;
            this.sex = sex;
    }
    }

Teacher类

    public class Teacher extends Person {
    String lesson;
    
    public Teacher(int number, String name, String sex, String lesson) {
        super(number, name, sex);
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.lesson = lesson;
    }
    }
这两类作为子类通过extends继承父类中具有的属性

Instance类

    import pack_one.Course;
通过import导入Course类

# 运行结果：
![image](https://github.com/yysn1/-/assets/124029692/b57cc214-1671-443d-a86c-0c1e5f1295e5)

# 实验感想： 

    通过这次实验，我大致了解并掌握了Java的继承性，知道了继承性是什么东西，具体怎么用。 为什么要有继承。
    1.当多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承那个类即可。 类继承语法规则: class Subclass extends SuperClass{ } 
    2.继承性的作用 继承的出现减少了代码冗余，提高了代码的复用性。 继承的出现，更有利于功能的扩展。 继承的出现让类与类之间产生了关系，提供了多态的前提。 注意：不要仅为了获取其他类中某个功能而去继承
    3.继承性的说明 子类继承了父类，就继承了父类的方法和属性。 在子类中，可以使用父类中定义的方法和属性，也可以创建新的数据和方法。 在Java 中，继承的关键字用的是“extends”，即子类不是父类的子集，而是对父类的“扩展” 。 关于继承的规则： 子类不能直接访问父类中私有的(private) 的成员变量和方法。 
    4.java中继承性的特点 Java只支持单继承和多层继承，不允许多重继承 一个子类只能有一个父类 一个父类可以派生出多个子类
