package Abstraction.Example2.Program4;
class Mage extends GameCharacter {

    public Mage(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.printf("%s casts a fireball\n",name);
    }


    
}
