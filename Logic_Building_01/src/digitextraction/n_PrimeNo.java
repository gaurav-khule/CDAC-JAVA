package digitextraction;

public class n_PrimeNo {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Prime No: " +i);
                count++;
            }
        }
        System.out.println("Total prime numbers: " + count);
    }
}
