class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override 
    boolean isVulnerable(){
        return false;
    }
    @Override 
    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        } else{
            return 6;
        }
    }

}

class Wizard extends Fighter{
    private boolean speel;
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        this.speel = true;
    } 
    @Override 
    boolean isVulnerable(){
        return !speel; }
    @Override
    int getDamagePoints(Fighter fighter){
        if(speel){
            return 12;
        } else{
            return 3;
        }
     }

}
