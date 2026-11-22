class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int total = 0;
    int numberOfVictories;
    public void drive() {
        total += 10;
    }

    public int getDistanceTravelled() {
       return total;
    }

    public int getNumberOfVictories() {
       return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.getNumberOfVictories(), this.numberOfVictories);
    }
}
