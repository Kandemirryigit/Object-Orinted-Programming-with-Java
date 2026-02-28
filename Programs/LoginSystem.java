public class LoginSystem {

    public static boolean validateUser(String username,String password){
        
        String correctUsername="admin";
        String correctPassword="123";

        return username.equals(correctUsername) && password.equals(correctPassword);
    }
    


    public static void main(String[] args){
        boolean isValid=validateUser("admin","123");

        if(isValid){
            System.out.println("Login succesful");
        }
        else{
            System.out.println("Invalid credentials");
        }

    }


}
