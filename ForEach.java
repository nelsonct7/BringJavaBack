public class ForEach {

    public static void main(String[] args) {
         int nums[]=new int[4];
        for(int i=0;i<4;i++){
        nums[i]=i;
    }
    for(int num : nums){
        System.out.println("Number using for each"+num);
    }
    }
}
