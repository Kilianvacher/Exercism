class Leap {
    boolean biYear;
    boolean isLeapYear(int year) {
       if(year%100 == 0){
        if(year%400 == 0){
            return biYear = true;
        }
       } else if(year%4 == 0){
        biYear = true;
       }
       return biYear;
    }

}
