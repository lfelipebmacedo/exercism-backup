class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        return numberToCheck == calculate(numberToCheck);
    }

    private int calculate(int numberToCheck) {
        String numberString = String.valueOf(numberToCheck);
        int length = numberString.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(numberString.substring(i, i + 1));
            result = (int) (result + Math.pow(num, length));
        }

        return result;
    }
}
