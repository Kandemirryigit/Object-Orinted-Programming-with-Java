public class DayTypeChecker{
    public static void main(String[] args){
        int day=6;

        String dayType=switch(day){
            case 1,2,3,4,5 -> "weekday";
            case 6,7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("Day "+day+" is a "+dayType);
       
    }
}