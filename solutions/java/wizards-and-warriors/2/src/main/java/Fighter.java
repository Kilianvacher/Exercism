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
        return fighter.isVulnerable() ? 10 : 6;
    }

}
class Wizard extends Fighter{
    private boolean speel;
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        speel = true;
    } 
    @Override 
    boolean isVulnerable(){
        return !speel; }
    @Override
    int getDamagePoints(Fighter fighter){
        return speel ? 12 : 3;}

}
