package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.equals("")) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            try {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            } catch (NumberFormatException e) {
                continue;
            }

        }
        return sum;
    }

}







