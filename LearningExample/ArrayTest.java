public class ArrayTest {
    public static void main(String[] args) {
        int td[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                td[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(td[i][j]);
            }
            System.out.println(' ');
        }
    }
}
