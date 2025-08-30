import java.util.Scanner;

public class StudentCheck {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        dataManagement sn = new dataManagement();
        boolean check= true;
        do { 
            System.out.println("Enter 1 to add data of student:- ");
            System.out.println("Enter 2 to update data of student:- ");
            System.out.println("Enter 3 to print data of specific student:- ");
            System.out.println("Enter 4 to search data of student:- ");
            System.out.println("Enter 0 to exits:- ");

            System.out.print("Enter Your choic:- ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> sn.addstudent(sc);
                case 2 -> sn.update(sc);
                case 3 -> sn.printData(sc);
                case 4 -> sn.search(sc);
                case 0 -> check = false;
                default -> System.out.println("Enter valid number:- ");
            }
        } while (check);
        sc.close();
    
    }
}

