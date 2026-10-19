class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake){
            return !knightIsAwake;
        } else{
            return !knightIsAwake;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       if(knightIsAwake || archerIsAwake || prisonerIsAwake){
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
       } else{
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
       }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       if(archerIsAwake){
        return !archerIsAwake;
       }
       else if(prisonerIsAwake){
        return prisonerIsAwake;
       } else{
        return prisonerIsAwake;
       }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            if(archerIsAwake){
                return !archerIsAwake;

            }else{
                 return !archerIsAwake;
            }
        } else{
            if(knightIsAwake || archerIsAwake){
                return !(knightIsAwake || archerIsAwake);
            } else if(prisonerIsAwake){
                return prisonerIsAwake;
            } else{
               return prisonerIsAwake; 
            }
        }

    }
}
