public class ForLoopArrayExample{
    public static void main(String[] args){
        
        int[] numbers={10,20,30,40,50,60,70,80,90,100};

        for(int i=0;i<10;i++){
            System.out.println("Element at index "+(i+1)+" is "+numbers[i]);
        }
    }
}