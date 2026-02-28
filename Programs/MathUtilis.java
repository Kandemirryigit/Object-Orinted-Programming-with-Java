public class MathUtilis {


    public static int findMax(int[] numbers){
        int max=numbers[0];

        for(int number:numbers){
            if(number>max){
                max=number;
            }
        }

        return max;
    }


    public static int findMin(int[] numbers){
        int min=numbers[0];

        for(int number:numbers){
            if(number<min){
                min=number;
            }
        }

        return min;
    }


    
    public static void main(String[] args){
        int[] arr={4,9,2,15,6};

        System.out.println("Max: "+findMax(arr));
        System.out.println("Min: "+findMin(arr));
    }
    

    
}
