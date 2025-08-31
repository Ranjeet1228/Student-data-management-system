import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        dataManagement sn = new dataManagement();
        boolean check= true;
        do{ 
            System.out.println("\nEnter \n1 to add data of student:- ");
            System.out.println("2 for update data of student:- ");
            System.out.println("3 for print data of specific student:- ");
            System.out.println("4 for search data of student:- ");
            System.out.println("5 for taking attendence:- ");
            System.out.println("6 to get attedence record of sudent:- ");
            System.out.println("7 to print record of sudent:- ");
            System.out.println("0 for exits:- ");

            System.out.print("Enter Your choic:- ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> sn.addstudent(sc);
                case 2 -> sn.update(sc);
                case 3 -> sn.printData(sc);
                case 4 -> sn.search(sc);
                case 5 -> sn.Attendence(sc);
                case 6 -> sn.totalPresent(sc);
                case 7-> sn.printAllData();
                case 0 -> check = false;
                default -> System.out.println("Enter valid number:- ");
            }
        } while (check);
        sc.close();
    
    }
}

