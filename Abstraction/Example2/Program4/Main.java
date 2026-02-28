package Abstraction.Example2.Program4;
public class Main {
    public static void main(String[] args){
        GameCharacter c1=new Warrior("Thor");
        GameCharacter c2=new Mage("Merlin");

        c1.attack();
        c2.attack();
    }

    
}
