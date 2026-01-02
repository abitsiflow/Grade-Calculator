import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculate calculate = new Calculate();
        int choice = 0;
        boolean mainIsRunning = true;

        while(mainIsRunning){
            System.out.println("************************");
            System.out.println("Student Grade Calculator");
            System.out.println("************************");
            System.out.println("1. Calculate Grades");
            System.out.println("2. Show Average");
            System.out.println("3. Exit");
            System.out.print("Enter choices (1-3):");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1 ->{
                    calculate.insert_subjects();
                }
                case 2 ->{
                    calculate.showGrade();
                }
                case 3 ->{
                    mainIsRunning = false;
                }
                default ->{
                    System.out.println("Invalid Choice, please try again!");
                }
            }
        }

    }
}