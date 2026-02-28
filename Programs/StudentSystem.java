public class StudentSystem {

    public static double calculateAverage(double[] grades){
        double sum=0;

        for(double grade:grades){
            sum+=grade;
        }

        return sum/grades.length;
    }


    public static String getLetterGrade(double average){
        if(average>=90) return "A";
        else if(average>=80) return "B";
        else if(average>=70) return "C";
        else if(average>=60) return "D";
        else return "F";
    }


    public static void main(String[] args){
        double[] grades={85,90,78,92};

        double avg=calculateAverage(grades);
        String letter=getLetterGrade(avg);

        System.out.println("Average: "+avg);
        System.out.println("Letter Grade: "+letter);
    }


}
