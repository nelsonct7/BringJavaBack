
public class ArrayStructure {
    public static void main(String[] args) {
        int[] nums = { 1, 8, 2, 3, 9, 4, 7, 12, 56, 85 };
        int target = 4;
        System.out.println("Linear search result for target : " + target);
        int elementIndex = ArrayStructure.linearSearch(nums, target);
        if (elementIndex == -1) {
            System.out.println("The target element is not found in the array ");
        } else {
            System.out.println(
                    "The target element " + target + " is present at the index of [" + elementIndex + "] in the array");
        }
        System.out.println("Binary search require array to be sorted always, so first sorting the array");
        int[] sorted = ArrayStructure.selectionSort(nums);
        System.out.println("Sorted array ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
        target = 66;
        elementIndex = -1;
        elementIndex = ArrayStructure.binarySearch(sorted, target);
        if (elementIndex == -1) {
            System.out.println("The element is not found in the array as per binary search");
        } else {
            System.out.println(
                    "The element " + target + " is found in the array at the index of [" + elementIndex + "]");
        }

        System.out.println("Binary search with recursion");
        target = 2;
        elementIndex = -1;
        elementIndex = ArrayStructure.binarySearchRecursion(sorted, target, 0, sorted.length - 1);
        if (elementIndex == -1) {
            System.out.println("The element is not found in the array as per binary search");
        } else {
            System.out.println(
                    "The element " + target + " is found in the array at the index of [" + elementIndex + "]");
        }
    }

    /**
     * linear search time complexity is O(n), if the number of elements in an array
     * doubles in size
     * linear search take that much time to complete the search and find the
     * element.
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    // binary search time complexity is O(log n), if the number of elements
    // increases to double in an array
    // binary search take 1 more step to complete the search
    public static int binarySearch(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        int result = -1;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        return result;
    }

    public static int binarySearchRecursion(int[] nums, int target, int left,int right){
        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return nums[mid];
            }else if(nums[mid]<target){
                return binarySearchRecursion(nums,target,mid+1,right);
            }else{
                return binarySearchRecursion(nums,target,left,mid-1);
            }
        }
        return -1;
    }

}
