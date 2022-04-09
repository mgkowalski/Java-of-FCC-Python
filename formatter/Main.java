package projects.formatter;

import java.util.ArrayList;
import java.util.Arrays;

import static projects.formatter.ArithmeticArranger.arithmeticArranger;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> defaultInput = new ArrayList<String>(Arrays.asList("32 + 698", "3801 - 2", "45 + 43", "123 + 49"));
        System.out.println(arithmeticArranger(defaultInput));
    }
}
