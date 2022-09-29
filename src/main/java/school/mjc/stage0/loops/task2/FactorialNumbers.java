package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int count = 0;
        while (count <= printToInclusive){
            int check = 1;
            factorial = 1;
            while (check <= count) {
                factorial *= check;
                check++;
            }
            System.out.println(factorial);
            count++;

        }
        }
    }

