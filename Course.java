package pack_one;

public class Course {
	public int id;
	public String Coursename;
	public String place;
	public String time;
	public float credit;
    
    public Course(String Coursename, int id, String place, String time, float credit) {
        this.id = id;
        this.Coursename = Coursename;
        this.place = place;
        this.time = time;
        this.credit = credit;
    }
    
    public String toString() {
        return Coursename + "(课程名)" + "     课程编号：" + id + "   上课地点：" + place
                + "    课程时间：" + time + "    学分: " + credit;
    }
}