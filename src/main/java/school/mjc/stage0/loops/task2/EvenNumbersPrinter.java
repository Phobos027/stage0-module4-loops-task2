package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int result = 0;
        while (result <= printTillInclusive) {
            if (result % 2 ==0 && result != 0) {
                System.out.println(result);
            }
            result++;
        }
    }
}
