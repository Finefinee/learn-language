package amiddle.array;

public class EnhancedFor1 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("num" + i + "번의 결과는: " + nums[i]);
        }
    }
}
