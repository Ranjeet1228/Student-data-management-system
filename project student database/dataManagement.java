import java.util.ArrayList;
import java.util.Scanner;

public class dataManagement {
    ArrayList<Student> st = new ArrayList<>();


    //1
    public void addstudent(Scanner sc){
         

        System.out.println("Enter the no of student:- ");
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.print("Enter name:- ");
            String name = sc.nextLine();
            System.out.print("Enter RollNo:- ");
            long roll = sc.nextLong();
            sc.nextLine(); 
            System.out.print("Enter collegeId:- ");
            int colId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter course:- ");
            String course = sc.nextLine();
            System.out.print("Enter marks:- ");
            double marks = sc.nextDouble();
            sc.nextLine();
            
            st.add(new Student(name, roll, colId, course, marks));
            System.out.println();
            System.out.println();
        }             
    }


    //2
    public void update(Scanner sc){


        System.out.println("Are you want any modication:- ");
        boolean ch = sc.nextBoolean();
        while (ch) { 
            System.out.println("Enter roll number:- ");
            long rollNum = sc.nextLong();

            for(Student s : st){
                 if(s.getRollNo() == rollNum){

                     System.out.println("Enter new name:- ");
                     s.setname(sc.nextLine());

                     System.out.print("Enter new Roll number:- ");
                     s.setRollNo(sc.nextLong());
                     sc.nextLine();

                     System.out.print("Enter College Id:- ");
                     s.setcollegeId(sc.nextInt());
                     sc.nextLine();

                     System.out.print("Enter new course datail:- ");
                     s.setcourse(sc.nextLine());
                     sc.nextLine();

                     System.out.print("Enter new marks of that student:- ");
                     s.setmarks(sc.nextDouble());
                     sc.nextLine();
                 }
            }

            System.out.println("Any more modifation, Enter Y for yes and N for no:- ");
            String c;
            do { 
                c= sc.next();
                if(c.equals("Y")){
                    ch = true;
                } else if(c.equals("n")){
                    ch = false;
                } else {
                    System.out.println("Enter again:- ");
                }
            } while(!c.equalsIgnoreCase("Y") && !c.equalsIgnoreCase("N"));

        }

        sc.close();
    }


    //3
    public void printData(Scanner sc){

        if(st.isEmpty()){
            System.out.println("Error! No data found.");
            return;
        }
        
        System.out.print("Enter roll No:- ");
        long Roll = sc.nextLong();

        for(Student student : st){
            if(student.getRollNo()==Roll){
                System.out.println(student);
            }
        }

       
    }


    //4
    public  void search(Scanner sc){


        if(st.isEmpty()){
            System.out.println("Error!, No data found.");
            return;
        }

        System.out.print("Enter Roll No:- ");
        long roll = sc.nextLong();
        
        for(Student s: st){
            if(s.getRollNo() == roll){
                System.out.println("Found: "+ s.getname());
                return;
            }
        }
        System.out.println("NOT FOUND!");
    }


    
}
