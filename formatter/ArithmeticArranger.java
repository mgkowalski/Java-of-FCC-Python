package projects.formatter;

import java.util.ArrayList;

public class ArithmeticArranger {
    public static String arithmeticArranger(ArrayList<String> problems, boolean solve) {

        String arranged = "";
        String solution;
        StringBuilder firstNum = new StringBuilder();
        StringBuilder secondNum = new StringBuilder();
        StringBuilder bottomLine = new StringBuilder();
        StringBuilder results = new StringBuilder();

        // Max 5 problems
        if (problems.size() > 5)
            return "Error: too many problems.";

        // *** The main loop ***
        // separate input into parts -- operands and operators; ints for math
        int first;
        int second;
        String operator;
        for (String problem : problems) {
            String[] parts = problem.split(" ");
            first = Integer.parseInt(parts[0]);
            operator = parts[1];
            second = Integer.parseInt(parts[2]);

            // String versions of Operands for display and error check
            String firstString = Integer.toString(first);
            String secondString = Integer.toString(second);
            // Error if number longer than 4 characters
            if (firstString.length() > 4 || secondString.length() > 4)
                return "Error, Numbers cannot be more than four digits";

            // addition and subtraction operations
            // Error if not + or -
            switch (operator) {
                case "+":
                    solution = Integer.toString(first + second);
                    break;
                case "-":
                    solution = Integer.toString(first - second);
                    break;
                default:
                    return "Error: Operator must be '+' or '-'.";
            }

            // Format for display; sort into lines
            // find max length; +2 for operator and space = the width of the column in this loop
            int length = ((Math.max(firstString.length(), secondString.length())) + 2);
            String top = String.format("%" + length + "s", firstString);
            String bottom = String.format("%s" + "%" + (length-1) + "s", operator, secondString);
            StringBuilder lines = new StringBuilder();
            String result = String.format("%" + length + "s", solution);

            // Add lines the length of the column
            for (int i = 0; i < length; i++)
                lines.append("-");

            // 4 lines between each column, none after the last column
            // Each loop the next values are added in each line
            if (!problem.equals(problems.get(problems.size() - 1))) {
                firstNum.append(top).append("    ");
                secondNum.append(bottom).append("    ");
                bottomLine.append(lines).append("    ");
                results.append(result).append("    ");
            }
            else{
                firstNum.append(top);
                secondNum.append(bottom);
                bottomLine.append(lines);
                results.append(result);
            }

            // The Output -- the lines with all of the values are concatenated and returned
            if (solve)
                arranged = firstNum + "\n" + secondNum + "\n" + bottomLine + "\n" + results;
            else
                arranged = firstNum + "\n" + secondNum + "\n" + bottomLine;

        }
        return arranged;
    }

    // *****Overload -- if optional boolean omitted, display problems without the result*****
    public static String arithmeticArranger(ArrayList<String> problems) {

        String arranged = "";
        StringBuilder firstNum = new StringBuilder();
        StringBuilder secondNum = new StringBuilder();
        StringBuilder bottomLine = new StringBuilder();

        // Max 5 problems
        if (problems.size() > 5)
            return "Error: too many problems.";

        // *** The main loop ***
        // separate input into parts -- operands and operators; ints for math
        int first;
        int second;
        String operator;
        for (String problem : problems) {
            String[] parts = problem.split(" ");
            first = Integer.parseInt(parts[0]);
            operator = parts[1];
            second = Integer.parseInt(parts[2]);

            // String versions of Operands for display and error check
            String firstString = Integer.toString(first);
            String secondString = Integer.toString(second);
            // Error if number longer than 4 characters
            if (firstString.length() > 4 || secondString.length() > 4)
                return "Error, Numbers cannot be more than four digits";

            // Error if not + or -
            switch (operator) {
                case "+":
                case "-":
                    break;
                default:
                    return "Error: Operator must be '+' or '-'.";
            }

            // Format for display; sort into lines
            // find max length; +2 for operator and space = the width of the column in this loop
            int length = ((Math.max(firstString.length(), secondString.length())) + 2);
            String top = String.format("%" + length + "s", firstString);
            String bottom = String.format("%s" + "%" + (length-1) + "s", operator, secondString);
            StringBuilder lines = new StringBuilder();

            // Add lines the length of the column
            for (int i = 0; i < length; i++)
                lines.append("-");

            // 4 lines between each column, none after the last column
            // Each loop the next values are added in each line
            if (!problem.equals(problems.get(problems.size() - 1))) {
                firstNum.append(top).append("    ");
                secondNum.append(bottom).append("    ");
                bottomLine.append(lines).append("    ");
            }
            else{
                firstNum.append(top);
                secondNum.append(bottom);
                bottomLine.append(lines);
            }

            // The Output -- the lines with all of the values are concatenated and returned
            arranged = firstNum + "\n" + secondNum + "\n" + bottomLine;

        }
        return arranged;
    }
}
