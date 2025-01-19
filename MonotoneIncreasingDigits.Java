// Description
/*
An integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.

Given an integer n, return the largest number that is less than or equal to n with monotone increasing digits.
*/
class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int n) {
        char[] number = String.valueOf(n).toCharArray();
        int marker = number.length;
        
        for (int i = number.length-1; i > 0; i--) {
            if(number[i] < number[i-1]) {
                marker = i;
                number[i-1]--;
            }
        }

        for (int i = marker; i < number.length; i++) {
            number[i] = '9';
        }

        return Integer.parseInt(new String(number));
    }

    public static void main(String args[]) {
        MonotoneIncreasingDigits mid = new MonotoneIncreasingDigits();
        System.out.println(mid.monotoneIncreasingDigits(332));
    }
}