package main.java.concepts.core.operators.bitWise.practice;

public class BinaryAndDecimalConvertors {

    public static void main(String[] args) {
        System.out.println(decimalToBinaryConvertor(50));
        System.out.println(decimalToBinaryConvertorDirect(50));
        System.out.println(binaryToDecimalConvertor(decimalToBinaryConvertor(50)));
        System.out.println(binaryToDecimalConvertorDirect(decimalToBinaryConvertorDirect(50)));
    }

    public static String decimalToBinaryConvertor(int input) {
        StringBuilder binary = new StringBuilder();
        //String binary = "";
        while (input > 0) {
            int remainder = input % 2;
            // binary = remainder + binary;   // prepending the remainder not appending
            binary.insert(0, remainder);
            input /= 2;
        }
        return binary.toString();
    }

    public static String decimalToBinaryConvertorDirect(int input) {
        return Integer.toBinaryString(input);
    }

    public static int binaryToDecimalConvertor(String input) {

        int decimal = 0;
        int power = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            int bit = input.charAt(i) - '0';
            decimal += (int) (bit * Math.pow(2, power));
            power++;
        }
        return decimal;
    }

    public static int binaryToDecimalConvertorDirect(String input) {
        return Integer.parseInt(input, 2);
    }

}
