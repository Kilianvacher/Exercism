public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int x){
        return 40 - x;
    }

    public int preparationTimeInMinutes(int y){
        return y*2;
    }

    public int totalTimeInMinutes(int y, int x){

        return x+preparationTimeInMinutes(y);
    }
}
