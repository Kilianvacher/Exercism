class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int exponent = String.valueOf(numberToCheck).length();
        int sum = 0;
        int number = numberToCheck;
        while(number>0){
            int digit = number%10;
            sum += Math.pow(digit, exponent);
            number = number/10;
        }
        return sum == numberToCheck;
    }

}
