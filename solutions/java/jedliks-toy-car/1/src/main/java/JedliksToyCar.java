public class JedliksToyCar {
    public int distance = 0;
    public int battery = 100;
    public static JedliksToyCar buy() {
       JedliksToyCar car1 = new JedliksToyCar();
       return car1;
    }

    public String distanceDisplay() {
       return "Driven " +distance+" meters";
    }

    public String batteryDisplay() {
       if(battery>0){
        return "Battery at "+ battery+"%";} else{
            return "Battery empty";
        }
    }

    public void drive() {
       if(battery >0){
        distance = distance + 20;
        battery = battery - 1;}
    }
}
