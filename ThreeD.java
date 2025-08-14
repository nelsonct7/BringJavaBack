public class ThreeD {
    public static void main(String[] args) {
        int nums[][][] = new int[10][10][10];
        System.out.println("Setting values to array");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    nums[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        System.out.println("\nSetting values to array");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" "+nums[i][j][k]);
                }
                System.out.println(' ');
            }
            System.out.println(" ");
        }
    }
}
