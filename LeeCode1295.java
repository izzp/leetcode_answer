/**
 * 1295. 统计位数为偶数的数字
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/3
 */
public class LeeCode1295 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 10 && nums[i] < 100) || (nums[i] >= 1000 && nums[i] < 10000) || nums[i] == 100000) {
                count++;
            }
        }
        return count;
    }
}
