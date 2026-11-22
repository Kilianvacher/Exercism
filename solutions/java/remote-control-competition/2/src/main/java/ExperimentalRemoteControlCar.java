public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int total = 0;
    public void drive() {
       total += 20;
    }

    public int getDistanceTravelled() {
        return total;
    }
}
