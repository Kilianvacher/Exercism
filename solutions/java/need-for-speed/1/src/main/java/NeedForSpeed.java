class NeedForSpeed {
  private int speed;
  private int batteryDrain;
  private int distanceTraveled = 0;
  private int battery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
      this.speed = speed;
      this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
      return battery<batteryDrain;
    }
    public int distanceDriven() {
      return distanceTraveled;
    }
    public void drive() {
      if(battery>0){
      distanceTraveled += speed;
      battery -= batteryDrain;
      }

    }
    public static NeedForSpeed nitro() {
      NeedForSpeed carroN = new NeedForSpeed(50, 4);
      return carroN;
    }
    public int getSpeed() {
      return speed;
    }
    public void setSpeed(int speed) {
      this.speed = speed;
    }
    public int getBatteryDrain() {
      return batteryDrain;
    }
    public void setBatteryDrain(int batteryDrain) {
      this.batteryDrain = batteryDrain;
    }
    public int getDistanceTraveled() {
      return distanceTraveled;
    }
    public void setDistanceTraveled(int distanceTraveled) {
      this.distanceTraveled = distanceTraveled;
    }
    public int getBattery() {
      return battery;
    }
    public void setBattery(int battery) {
      this.battery = battery;
    }
    
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
      this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      int moves = distance/car.getSpeed();
      if(distance%car.getSpeed() != 0){
        moves += 1;
      }
      int canFinish = moves *car.getBatteryDrain();
      if(canFinish<=car.getBattery()){
        return true;
      } else{
        return false;
      }
    }
}
