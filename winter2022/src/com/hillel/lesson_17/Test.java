package com.hillel.lesson_17;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String strNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the number u want to see as pseudo-graphics: ");
        strNumber = scanner.nextLine();
        Test.outPutResult(strNumber);
    }

    private static String[] getGraphicalTemplate(String number) {

        switch (number) {
            case "1" -> {
                return new String[]{
                        "  @@  ",
                        " @@@  ",
                        "@ @@  ",
                        "  @@  ",
                        "@@@@@@"};

            }
            case "2" -> {
                return new String[]{
                        " @@@@ ",
                        "@@  @@",
                        "   @@ ",
                        "  @@  ",
                        "@@@@@@"};
            }
            case "3" -> {
                return new String[]{
                        " @@@@ ",
                        "@@  @@",
                        "   @@ ",
                        "@@  @@",
                        " @@@@ "};
            }
            case "4" -> {
                return new String[]{
                        "   @@ ",
                        "  @ @ ",
                        " @  @ ",
                        "@@@@@@",
                        "    @ "};
            }
            case "5" -> {
                return new String[]{
                        "@@@@@@",
                        "@@    ",
                        "@@@@@ ",
                        "    @@",
                        "@@@@@ "};
            }
            case "6" -> {
                return new String[]{
                        " @@@@ ",
                        "@@    ",
                        "@@@@@ ",
                        "@@  @@",
                        " @@@@ "};
            }
            case "7" -> {
                return new String[]{
                        "@@@@@@",
                        "   @@ ",
                        "  @@  ",
                        " @@   ",
                        "@@    "};
            }
            case "8" -> {
                return new String[]{
                        " @@@@ ",
                        "@@  @@",
                        " @@@@ ",
                        "@@  @@",
                        " @@@@ "};
            }
            case "9" -> {
                return new String[]{
                        " @@@@ ",
                        "@@  @@",
                        " @@@@@",
                        "    @@",
                        " @@@@ "};
            }
            case "0" -> {
                return new String[]{
                        " @@@@ ",
                        "@@  @@",
                        "@@  @@",
                        "@@  @@",
                        " @@@@ "};
            }
            default -> {
                return new String[]{"ERROR"};
            }
        }
    }

    private static String[] transformNumToGraphics(String number) throws IndexOutOfBoundsException {
        String reverseNumberStr = new StringBuffer(number).reverse().toString();
        int spaces = number.length() - number.replaceAll(" ", "").length();
        int strLengthNoSpaces = number.length() - spaces;
        int counter = 0;
        String[] splittingTheNumberStr = reverseNumberStr.split(" ");
        String[] stringNumArr = {"", "", "", "", ""};
        String[] tempArr;
        try {
            while (counter != strLengthNoSpaces) {
                for (String s : splittingTheNumberStr) {
                    tempArr = getGraphicalTemplate(s);
                    for (int i = 0; i < stringNumArr.length; i++) {
                        stringNumArr[i] = tempArr[i] + " " + stringNumArr[i];
                    }
                    counter++;
                }
            }
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Please, enter your number using SPACES after each numeral!"
                    + "\nExample: 0 2 3 4 5");
        }
        return stringNumArr;
    }

    private static void printStreamOfTransformedNum(String[] strArr) {
        Arrays.stream(strArr).forEach(System.out::println);
    }

    public static void outPutResult(String strNumber) {
        Test.printStreamOfTransformedNum(Test.transformNumToGraphics(strNumber));
    }
}