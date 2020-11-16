import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int[] gradeT = new int[]{};
        ArrayList<String> gradeT = new ArrayList<>();
        ArrayList<String> gradeH = new ArrayList<>();
        ArrayList<String> gradeL = new ArrayList<>();
        //Test grade, HomeWork grade, Lab Grades;
        int n = 1, k= 1, testLength = 3, homeworkLength = 8, labLength = 7;


        System.out.println("Please enter the Test grades.");
        System.out.println("Enter Na to skip entry.");
        System.out.println("Or enter Finish to skip the rest");
        for(int j = 1; j < 4; j++){
            if(j <= 2 ){
                System.out.println("Please Enter your midterm " + j + " grade");
            }
            else if(j > 2){
                System.out.println("Please Enter your Final grade");
            }
            String scoreT = scan.next();
            if(scoreT.equalsIgnoreCase("na")){continue;}
            else if(scoreT.equalsIgnoreCase("finish"))break;
             gradeT.add(scoreT);
        }

        System.out.println("Please enter the HomeWork grades");
        System.out.println("Enter Na to skip.");
        System.out.println("Or enter Finish to move on");
        System.out.println();
        while(n < 9){
            System.out.println("Please enter grade for Practice Problem " + n + ": ");
            String score = scan.next();
            if(score.equalsIgnoreCase("na")){continue;}
            else if(score.equalsIgnoreCase("finish"))break;
            else{gradeH.add(score);}
            n++;
        }

        System.out.println("Please enter the Lab grades");
        System.out.println("Enter Na to skip.");
        System.out.println("Or enter Finish to move on");
        System.out.println();
        while(k < 7){
            System.out.println("Please enter grade for Lab " + k + ": ");
            String scoreL = scan.next();
            if(scoreL.equalsIgnoreCase("na")){continue;}
            else if(scoreL.equalsIgnoreCase("finish"))break;
            else{gradeL.add(scoreL);}
            k++;
        }

        int total = 0, totalT = 0, totalH = 0, totalL = 0;
        for(int i = 0; i < gradeT.size(); i++){
            int sum = 0;
            sum += Integer.parseInt(gradeT.get(i));
            totalT += sum;
        }
        for(int i = 0; i < gradeH.size(); i++){
            int sum = 0;
            sum += Integer.parseInt(gradeH.get(i));
            totalH += sum;
        }
        for(int i = 0; i < gradeL.size(); i++){
            int sum = 0;
            sum += Integer.parseInt(gradeL.get(i));
            totalL += sum;
        }
        totalT  = (int) (0.40*(totalT/gradeT.size()));
        totalH  = (int) (0.44*(totalH/gradeH.size()));
        totalL  = (int) (0.16*(totalL/gradeL.size()));

        total = totalL + totalH +totalT;

        System.out.println("Your Current Grade is :" + total);

        int remain = 100;
        remain -= total;

        double testGrade = testLength / 40;
        double homeworkGrade = homeworkLength / 44;
        double labGrade = labLength / 16;


        System.out.println("You will need to score 100% on at least " + remain / testGrade + "'s tests to get a 100");


    }
}
