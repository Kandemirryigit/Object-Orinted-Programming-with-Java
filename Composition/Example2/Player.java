class Player {

    private String name;
    private Weapon weapon;  // Player HAS a Weapon

    public Player(String name,Weapon weapon){
        this.name=name;
        this.weapon=weapon;
    }

    public void attack(){
        System.out.printf("%s attacks with %s and deals %d damage\n",name,weapon.getName(),weapon.getDamage());
    }


    
}
