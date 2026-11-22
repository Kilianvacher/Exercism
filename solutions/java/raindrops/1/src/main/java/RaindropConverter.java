class RaindropConverter {
    String convert(int number) {
        String total = "";
       if(number%3 == 0){
        total += "Pling";
       } if(number%5 == 0){
        total += "Plang";
       }if(number%7 == 0){
        total += "Plong";
       }
        if (total == "") {
            return String.valueOf(number);
        }
       return total;
    }

}
