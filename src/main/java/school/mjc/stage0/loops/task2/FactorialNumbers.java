package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int count = 0;
        while (count <= printToInclusive){
            if (count == 0){
                factorial = 1;
            } else {
                factorial *= count;
            }
            count++;
            System.out.println(factorial);
        }
        }
    }

