

public class Student{
    private String name;
    private long RollNo;
    private int collegeId;
    private String course;
    private double  marks;
    private int present =0;
    private int totalDay = 0;


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

    public void markpresent(){
        present++;
        totalDay++;
    }

    public void markAbsent(){
        totalDay++;
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

    int getpresent(){
        return present;
    }

    int getpercent(){
        if(totalDay==0){
            System.out.println("Class not star yet");
            return -1;
        }
        return(present*100)/totalDay;
    }

    int getTotalDay(){
        return totalDay;
    }

    @Override

    public String toString(){
        return "\nName:- " + name +"\nRoll No:- "+ RollNo +  "\n Course:- " +course +"\nCollege Id:- "+ collegeId + "\nMarks:- " + marks +"\nAttendence:- "+ present+" in "+totalDay+ "\n End......\n \n";
    }
}
