package Abstraction.Example2.Program4;
class Warrior extends GameCharacter {

    public Warrior(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.printf("%s attacks with sword!\n",name);
    }

    
}
