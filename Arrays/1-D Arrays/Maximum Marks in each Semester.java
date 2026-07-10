import java.util.Scanner;

public class MaxMarksInSem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of semester: ");
        int semesters = sc.nextInt();
        int [] subjects = new int[semesters];
        for (int i=0; i<semesters; i++){
            System.out.println("Enter number of Subjects in " + (i+1) + " semester:");
            subjects[i] = sc.nextInt();
        }
        int[] maxMarks = new int[semesters];
        for(int i=0; i<semesters; i++){
            int m = -1;
            System.out.println("Marks obtained in semester "+(i+1)+":");
            for(int j=0 ;j<subjects[i]; j++){
                int marks = sc.nextInt();
                if(marks < 0 || marks > 100){
                    System.out.println("Invalid marks.");
                    System.exit(0);
                }
                if(marks > m){
                    m = marks;
                    maxMarks[i] = m;
                }
            }
        }
        for(int i=0; i<semesters; i++){
            System.out.println("Maximum mark in "+(i+1)+" semester: "+maxMarks[i]);
        }
    }
}
