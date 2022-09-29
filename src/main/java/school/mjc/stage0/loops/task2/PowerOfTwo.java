package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        if (power < 0) System.out.println("too much power");
        else {
            while (count <= power) {
                int result = 1;
                if (count != 0) {
                    int check = 1;
                    while (check <= count) {
                        result *= 2;
                        check++;
                    }
                }
                System.out.println(result);
                count++;
            }
        }
    }
}
