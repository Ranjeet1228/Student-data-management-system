import java.util.ArrayList;
import java.util.Scanner;

public class dataManagement {
    ArrayList<Student> st = new ArrayList<>();


    //1
    public void addstudent(Scanner sc){
         
        System.out.println("\n Enter the no of student:- ");
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the data of "+ (i+1) +" student:- ");
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


        System.out.println("\n Are you want any modication:- ");
        boolean ch = sc.nextBoolean();
        sc.nextLine();

        while (ch) { 
            System.out.println("Enter roll number:- ");
            long rollNum = sc.nextLong();
            sc.nextLine();

            for(Student s : st){
                 if(s.getRollNo() == rollNum){

                     System.out.println("Enter new name:- ");
                     sc.nextLine();
                     s.setname(sc.nextLine());
                    //  sc.nextLine();

                     System.out.print("Enter new Roll number:- ");
                     s.setRollNo(sc.nextLong());
                     sc.nextLine();

                     System.out.print("Enter College Id:- ");
                     s.setcollegeId(sc.nextInt());
                     sc.nextLine();

                     System.out.print("Enter new course datail:- ");
                     s.setcourse(sc.nextLine());
                     //sc.nextLine();

                     System.out.print("Enter new marks of that student:- ");
                     s.setmarks(sc.nextDouble());
                     sc.nextLine();
                 }
                 System.out.println();
            }

            System.out.println("\nAny more modifation, Enter Y for yes and N for no:- ");
            String c;
            do { 
                c= sc.next();
                if(c.equalsIgnoreCase("Y")){
                    ch = true;
                } else if(c.equalsIgnoreCase("N")){
                    ch = false;
                } else {
                    System.out.println("Enter again:- ");
                }
            } while(!c.equalsIgnoreCase("Y") && !c.equalsIgnoreCase("N"));

        }

    }


    //3
    public void printData(Scanner sc){

        if(st.isEmpty()){
            System.out.println("\nError! No data found.");
            return;
        }
        
        System.out.print("Enter roll No:- ");
        long Roll = sc.nextLong();

        System.out.println();
        for(Student student : st){
            if(student.getRollNo()==Roll){
                System.out.println("............");
                System.out.println(student);
                System.out.println("...........");
                return;
            }
        }
        System.out.println("...... Error! not found.......");

       
    }


    //4
    public  void search(Scanner sc){


        if(st.isEmpty()){
            System.out.println("\nError!, No data found.");
            return;
        }

        System.out.print("Enter Roll No:- ");
        long roll = sc.nextLong();
        
        for(Student s: st){
            if(s.getRollNo() == roll){
                System.out.println("...........");
                System.out.println("\nFound: "+ s.getname());
                System.out.println("...........");
                return;
            }
        }
        System.out.println("\n NOT FOUND!");
    }


    
}
