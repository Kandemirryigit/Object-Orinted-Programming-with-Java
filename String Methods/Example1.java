

public class Example1 {
    public static void main(String[] args){
        String name="Bro code";

        // To find the string's length
        int length=name.length();
        System.out.println("The name string's lenght is: "+length);

        // To find the character at a specaial index in a string
        char letter0=name.charAt(0);
        char letter1=name.charAt(1);
        char letter2=name.charAt(2);
        System.out.println("The character in 0.index: "+letter0);
        System.out.println("The character in 1.index: "+letter1);
        System.out.println("The character in 2.index: "+letter2);


        // To find index of a special character in the string
        // index finds the first index
        int index1=name.indexOf('B');
        int index2=name.indexOf('c');
        System.out.println("The index of character B is: "+index1);
        System.out.println("The index of character c is: "+index2);



        // To find a special characters last index in the string
        int lastIndex1=name.lastIndexOf('o');
        System.out.println("The last index of character o is: "+lastIndex1);

        

        // To uppercase all letters in the string
        System.out.println("Uppercased string: "+name.toUpperCase());


        // To lowercase all letters in the string
        System.out.println("Lowercased string: "+name.toLowerCase());


        // trim()
        String text1="      Hello     ";
        System.out.println("Trimmed string: "+text1.trim());


        // replace()
        String text2="Hello World";
        System.out.println("Replaced string: "+text2.replace("World","Kandemir"));



        // isEmpty()
        String text3="Hello";
        String text4="";
        System.out.println("Is text3 empty: "+text3.isEmpty());
        System.out.println("Is text4 empty: "+text4.isEmpty());



        // contains()
        String text5="Yigit Kandemir";
        System.out.println("Your name contains letter i: "+text5.contains("i"));
        System.out.println("Your name contains letter l: "+text5.contains("l"));



        // equals()
        String password="123";
        if(password.equals("123")){
            System.out.println("Your password is correct");
        }else{
            System.out.println("your password is incorrect");
        }



        // Substring()   hard coded
        String email="Bro123@gmail.com";
        String username=email.substring(0,6);
        String domain=email.substring(7,16);
        System.out.println(username);
        System.out.println(domain);


        // Substring() intelligent
        String email2="kandemirryigit@gmail.com";
        String username2=email2.substring(0,email2.indexOf("@"));
        String domain2=email2.substring(email2.indexOf("@"),email2.length());

        System.out.println(username2);
        System.out.println(domain2);


    
        
    }
    
}
