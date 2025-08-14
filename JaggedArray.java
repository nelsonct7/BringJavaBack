public class JaggedArray {
    public static void main(String[] args) {
        int nums[][]=new int[10][];
        System.out.println("Setting column sizes");
        for(int i=0;i<nums.length;i++){
            int size=(int)(Math.random()*10);
            nums[i]=new int[size];
        }
        System.out.println("Setting values to array");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println("\nValues added to jagged array are");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println(' ');
        }
    }
}
