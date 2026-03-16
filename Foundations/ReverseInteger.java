// #Problem: https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        int number = 0;

        while(x != 0) {
            int digit =  x % 10;

            if((number > (Integer.MAX_VALUE / 10)) || (number == (Integer.MAX_VALUE / 10) && digit > 7)) {
                System.out.println(0);
            }

            if((number < (Integer.MIN_VALUE / 10)) || (number == (Integer.MIN_VALUE / 10) && digit < -8)) {
                System.out.println(0);
            }
            number = number * 10 + digit;
            x = x / 10;
        }

        System.out.println(number);
    }
}


// Time complexity: O(d) where d is the number of digit
// Space complexity: O(1)