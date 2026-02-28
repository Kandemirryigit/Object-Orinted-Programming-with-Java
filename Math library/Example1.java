public class Example1 {
    public static void main(String[] args){

        // To display pi number
        System.out.println("PI: "+Math.PI);

        // To display e number
        System.out.println("e: "+Math.E);

        // To make 2**5 operation
        double result=Math.pow(2,5);
        System.out.println("2**5: "+result);

        // To see the absolute value
        int result2=Math.abs(-5);
        System.out.println("Absolute value of -5 is: "+result2);

        // To find square root of a number
        double result3=Math.sqrt(9);
        System.out.println(result3);


        // Round
        double result4=Math.round(3.14);
        double result5=Math.round(5.68);
        double result6=Math.round(5.5);
        double result7=Math.round(-4.4);
        double result8=Math.round(-4.6);
        System.out.println("When we round 3.14 it happens: "+result4);
        System.out.println("When we round 5.68 it happens: "+result5);
        System.out.println("When we round 5.5 it happens: "+result6);
        System.out.println("When we round -4.4 it happens: "+result7);
        System.out.println("When we round -4.6 it happens: "+result8);



        // Ceil
        double result9=Math.ceil(4.1);
        double result10=Math.ceil(4.9);
        double result11=Math.ceil(4.0);
        double result12=Math.ceil(-4.2);
        double result13=Math.ceil(-4.9);
        System.out.println("When we ceil 4.1 it happens: "+result9);
        System.out.println("When we ceil 4.9 it happens: "+result10);
        System.out.println("When we ceil 4.0 it happens: "+result11);
        System.out.println("When we ceil -4.2 it happens: "+result12);
        System.out.println("When we ceil -4.9 it happens: "+result13);




        // floor
        double result14=Math.floor(4.9);
        double result15=Math.floor(4.1);
        double result16=Math.floor(4.0);
        double result17=Math.floor(-4.1);
        double result18=Math.floor(-4.9);
        System.out.println("When we floor 4.9 it happens: "+result14);
        System.out.println("When we floor 4.1 it happens: "+result15);
        System.out.println("When we floor 4.0 it happens: "+result16);
        System.out.println("When we floor -4.1 it happens: "+result17);
        System.out.println("When we floor -4.9 it happens: "+result18);




    }
    
}
