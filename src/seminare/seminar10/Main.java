package seminare.seminar10;

import java.util.Map;
import java.util.Stack;

public class Main {

    public static void rpnSolveAtom(String atom, Stack<Float> stack) {
        switch(atom) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                stack.push(stack.pop() - stack.pop());
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "/":
                stack.push(stack.pop() / stack.pop());
                break;
            default:
                stack.push(Float.parseFloat(atom));
        }
    }

    public static int rpnCalc(String expr) {
        Stack<Float> stack = new Stack<Float>();

        int idx = 0;
        int cur = 0;
        while(cur != -1) {
            cur = expr.indexOf(" ", idx);
            if(cur == -1)
                break;

            String atom = expr.substring(idx, cur);

            rpnSolveAtom(atom, stack);

            idx = cur + 1;
        }

        rpnSolveAtom(expr.substring(idx), stack);

        return stack.pop().intValue();
    }

    public static void rpnSolveAtomVariables(String atom, Stack<Integer> stack, Map<String, Integer> variables) {
        if(variables.containsKey(atom)) {
            stack.push(variables.get(atom));
            return;
        }

        switch(atom) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                stack.push(stack.pop() - stack.pop());
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "/":
                stack.push(stack.pop() / stack.pop());
                break;
            default:
                stack.push(Integer.parseInt(atom));
        }
    }

    public static int rpnCalcVariables(String expr, Map<String, Integer> variables) {
        Stack<Integer> stack = new Stack<Integer>();

        int idx = 0;
        int cur = 0;
        while(cur != -1) {
            cur = expr.indexOf(" ", idx);
            if(cur == -1)
                break;

            String atom = expr.substring(idx, cur);

            rpnSolveAtomVariables(atom, stack, variables);

            idx = cur + 1;
        }

        rpnSolveAtomVariables(expr.substring(idx), stack, variables);

        return stack.pop().intValue();
    }
}
