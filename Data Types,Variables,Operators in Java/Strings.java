
public class Strings{
    public static void main(String[] args){

        // We can create a string like this
        String message="Hello World!";
        System.out.println(message);


        // We can create a sting with new keyword too
        String str1= new String("Java");
        System.out.println(str1);

        
        // We can create a string from an array of characters
        char[] charArray={'H','e','l','l','o'};
        String messageFromArray= new String(charArray);
        System.out.println(messageFromArray);



        // There are numerous methods for manipulating strings
        // Here are some of the most commonly used

        // length()
        String myString="Java is fun";
        int length=myString.length();
        System.out.println(length);


        // concat()
        String firstName="Yigit";
        String secondName="Kandemir";
        String fullNameConcat=firstName.concat(secondName);
        System.out.println(fullNameConcat);


        // substring()
        String message2="Hello World";
        String sub1=message2.substring(7);
        System.out.println(sub1);
        String sub2=message.substring(0,5);
        System.out.println(sub2);


        // tolowercase()  touppercase()
        String text="Java Programming";
        String lowerCaseText=text.toLowerCase();
        String upperCaseText=text.toUpperCase();

        System.out.println(lowerCaseText);
        System.out.println(upperCaseText);



        // trim()
        String stringWithWhiteSpace="         Hello,world!";
        String trimmedString=stringWithWhiteSpace.trim();
        System.out.println(trimmedString);



        // replace()
        String message3="Hello, World!";
        String replacedMessage=message.replace("world","java");
        System.out.println(replacedMessage);



        // split()
        String csvData="John,Doe,30,New York";
        String[] values=csvData.split(",");
        for(String value : values){
            System.out.println(value);
        }



        // equals()   equalsIgnoreCase()
        String str4="Java";
        String str5="java";

        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));



        // isempty()
        String emptyString="";
        String nullString=null;

        System.out.println("Is emptyString empty? "+emptyString.isEmpty());

        if(nullString==null){
            System.out.println("nullString is null ");
        }




        // indexOf()   lastIndexOf()
        String text2="This is a test string";
        int firstIndex=text2.indexOf(text2);
        int lastIndex=text2.lastIndexOf(text2);
        System.out.println(firstIndex);
        System.out.println(lastIndex);



        // format()
        String name1="Alice";
        int age=30;
        double salary=5000.0;
        String formattedString=String.format("Name:%s , Age: %d , Salary: %.2f",name1,age,salary);
        System.out.println(formattedString);
        





    }
}