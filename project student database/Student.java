public class Student{
    private String name;
    private long RollNo;
    private int collegeId;
    private String course;
    private double  marks;


    //constructor to add detail of student;

     Student(String name, long RollNo, int collegeId, String course, double marks){
        this.name = name;
        this.RollNo = RollNo;
        this.collegeId = collegeId;
        this.course = course;
        this.marks = marks;
    }


    public void setname(String name){
        this.name = name;
    }

    public void setRollNo(long RollNo){
        this.RollNo = RollNo;
    }
    public void setcollegeId(int collegeId){
        this.collegeId = collegeId;
    }

    public void setcourse(String course){
        this.course = course;
    }

    public void setmarks(double marks){
        this.marks = marks;
    }



    String getname(){
        return name;
    }

    long getRollNo(){
        return RollNo;
    }

    int getcollegeId(){
        return collegeId;
    }

    String getcourse(){
        return course;
    }

    double getmarks(){
        return marks;
    }

    @Override

    public String toString(){
        return "Roll No:- "+ RollNo + "\nName:- " + name + "\n Course:- " +course + "\n Marks:- " + marks + "\n End......\n";
    }

}
