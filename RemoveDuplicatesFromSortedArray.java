class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            
            if (nums [j] != nums [i]) {
                i++;

                nums [i] = nums [j];
            }
        }

        System.out.println("Unique elements counts: " + (i + 1));

        for(int k = 0; k <= i; k++) {
            System.out.println(nums[k] + " ");
        }
    }
}