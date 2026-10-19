class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return !knightIsAwake;
        } else{
            return !knightIsAwake;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       if(knightIsAwake || archerIsAwake || prisonerIsAwake == true){
        return true;
       } else{
        return false;
       }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       if(archerIsAwake == true){
        return !archerIsAwake;
       }
       else if(prisonerIsAwake == false){
        return prisonerIsAwake;
       } else{
        return true;
       }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            if(archerIsAwake){
                return false;

            }else{
                 return true;
            }
        } else{
            if(knightIsAwake || archerIsAwake){
                return false;
            } else if(prisonerIsAwake){
                return true;
            } else{
               return false; 
            }
        }

    }
}
