public class Main {
    public static void main(String[] args){

        Weapon sword=new Weapon("Sword",50);
        Player player=new Player("Yigit",sword);

        player.attack();
    }
    
}
