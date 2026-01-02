import java.util.Scanner;

public class Calculate {
    Scanner scan = new Scanner(System.in);
    String subjects[] = null;
    double grades[];
    int enrolledSubjects = 0;
    static double ave;

    void insert_subjects(){

        System.out.print("How many subjects did you take: ");
        enrolledSubjects = scan.nextInt();
        scan.nextLine();

        subjects = new String[enrolledSubjects];
        grades = new double[enrolledSubjects];

        for(int i = 0; i < subjects.length; i++){
            System.out.print("Enter the name of the subject: ");
            subjects[i] = scan.nextLine().trim();

        }
        System.out.println();
        for(int j  = 0; j < grades.length; j++){
            System.out.println("Enter the grades of the subject: ");
            grades[j] = scan.nextDouble();
            scan.nextLine();
        }
        System.out.println();
        System.out.println("<<Insertion Complete>>");
        System.out.println();

        ave = 0;

        for(int i = 0; i < enrolledSubjects; i++) {

            ave += grades[i];
        }
            System.out.println("Total Grades Compute: " + ave);
            System.out.println("Average: " + (ave / enrolledSubjects));


    }



   void showGrade(){
        if(subjects == (null) && grades == null ){
            System.out.println("No Data yet.");
            return;
        }

       System.out.println("Average: " + ave);
   }
}
