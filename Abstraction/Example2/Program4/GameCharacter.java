package Abstraction.Example2.Program4;
abstract class GameCharacter {

    protected String name;

    public GameCharacter(String name){
        this.name=name;
    }

    public abstract void attack();
    
}
