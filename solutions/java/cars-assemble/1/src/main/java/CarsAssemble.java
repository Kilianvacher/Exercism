public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double produto = speed*221;
        if(speed>=1 && speed<=4){
            return produto*1.0;
        } else if(speed>= 5 && speed<= 8){
            return produto*0.9;
        } else if(speed == 9){
            return produto*0.8;
        }  
        else if(speed==10){
            return produto*0.77;
        } else{
            return 0.0;
        }
       }
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}


