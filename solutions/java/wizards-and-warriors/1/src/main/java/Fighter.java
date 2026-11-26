class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
     public String toString(){
        return "Fighter is a Warrior";
    }  

    @Override
    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        }
        
        return 6;
    }
}

class Wizard extends Fighter{
    private boolean spellPrepared = false;
    
    @Override
    boolean isVulnerable(){
        return !spellPrepared;
    }
    
    boolean prepareSpell(){
        spellPrepared = true;
        return true;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    @Override
    int getDamagePoints(Fighter fighter){
        if(spellPrepared == true){
            return 12;
        }
        
        return 3;
    }
}


