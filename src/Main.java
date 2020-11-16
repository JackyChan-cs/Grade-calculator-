import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int[] gradeT = new int[]{};
        ArrayList<String> gradeT = new ArrayList<>();           //Arrays to hold scores
        ArrayList<String> gradeH = new ArrayList<>();
        ArrayList<String> gradeL = new ArrayList<>();
        //Test grade, HomeWork grade, Lab Grades;
        int n = 1, k= 1, testLength = 3, homeworkLength = 8, labLength = 7;


        System.out.println("Please enter the Test grades.");
        System.out.println("Enter Na to skip entry.");
        System.out.println("Or enter Finish to skip the rest");
        for(int j = 1; j < 4; j++){                                                                     //Will ask for 3 separte test scores
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
        while(n < 9){                                                                               //loops to ask for 8 different homework scores
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
        while(k < 7){                                                                       //loops to ask for 6 different lab grades
            System.out.println("Please enter grade for Lab " + k + ": ");
            String scoreL = scan.next();
            if(scoreL.equalsIgnoreCase("na")){continue;}
            else if(scoreL.equalsIgnoreCase("finish"))break;
            else{gradeL.add(scoreL);}
            k++;
        }

        int total = 0, totalT = 0, totalH = 0, totalL = 0;                                          //retrives all score values 
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
        totalT  = (int) (0.40*(totalT/gradeT.size()));                                      //calculates total sum average of each grade
        totalH  = (int) (0.44*(totalH/gradeH.size()));
        totalL  = (int) (0.16*(totalL/gradeL.size()));

        total = totalL + totalH +totalT;                                                

        System.out.println("Your Current Grade is :" + total);                          //returns current average in class.

        int remain = 100;
        remain -= total;
        remain = remain % 10;

        int min = 10 - remain;                                                          //calculates how far away the next grade letter is

        double testGrade = 40/testLength;
        double homeworkGrade =  44/homeworkLength;
        double labGrade = 16/labLength;



        System.out.println("What letter Grade do you seek? ");

        String seek =  "";
        int value = 0;
        switch (scan.next().toLowerCase()){                             //switch case statement to check for which letter grade input.
            case "a":
                seek = "a";
                value = 90;
                if(total > value){
                    System.out.println("You already have this grade or higher");
                    break;
                }
                else{
                    System.out.println("You will need to score 100% on at least " + (float)(min / testGrade) + " tests to get an " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / homeworkGrade) + " homeworks to get an " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / labGrade) + " labs to get an " + seek.toUpperCase());
                    break;
                }

            case "b":
                seek = "b";
                value = 80;
                if(total > value){
                    System.out.println("You already have this grade or higher");
                    break;
                }
                else{
                    System.out.println("You will need to score 100% on at least " + (float)(min / testGrade) + " tests to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / homeworkGrade) + " homeworks to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / labGrade) + " labs to get a " + seek.toUpperCase());
                    break;
                }
            case "c":
                seek = "c";
                value = 70;
                if(total > value){
                    System.out.println("You already have this grade or higher");
                    break;
                }
                else{
                    System.out.println("You will need to score 100% on at least " + (float)(min / testGrade) + " tests to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / homeworkGrade) + " homeworks to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / labGrade) + " labs to get a " + seek.toUpperCase());
                    break;
                }
            case "d":
                seek = "d";
                value = 65;
                if(total > value){
                    System.out.println("You already have this grade or higher");
                    break;
                }
                else{
                    System.out.println("You will need to score 100% on at least " + (float)(min / testGrade) + " tests to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / homeworkGrade) + " homeworks to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / labGrade) + " labs to get a " + seek.toUpperCase());
                    break;
                }
            case "f":
                seek = "f";
                value = 0;
                if(total > value){
                    System.out.println("You already have this grade or higher");
                    break;
                }
                else{
                    System.out.println("You will need to score 100% on at least " + (float)(min / testGrade) + " tests to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / homeworkGrade) + " homeworks to get a " + seek.toUpperCase());
                    System.out.println("You will need to score 100% on at least " + (float)(min / labGrade) + " labs to get a " + seek.toUpperCase());
                    break;
                }
        }


    }
}
