
class BirdWatcher {
    private final int[] birdsPerDay; 
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        birdsPerDay = new int[]{0, 2, 5, 3, 7, 8, 4};

    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
       if(birdsPerDay.length == 0){
        return 0;
       } else{
        return birdsPerDay[birdsPerDay.length - 1];
       }
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
       for(int birdCount: birdsPerDay){
        if(birdCount == 0){
            return true;
        }
       }
       return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > birdsPerDay.length){
        numberOfDays = birdsPerDay.length;
        }
            for(int i = 0; i<numberOfDays; i++){
                sum+= birdsPerDay[i];
            }



        return sum;
    }

    public int getBusyDays() {
      int busyDay = 0;
      for(int birdBusy : birdsPerDay){
        if(birdBusy>= 5){
            busyDay++;
        }
      }
      return busyDay;
    }
}
