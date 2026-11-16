class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
        //I know about Math.hypot(), but I chose this formula to make the math easier to read for people unfamiliar with it.  
        if(distance>5 && distance<=10){
            return 1;
        } else if(distance>1 && distance<=5){
            return 5;
        } else if(distance<=1){
            return 10;
        } else{
            return 0;
        }
    }
}
