public class RemoveDuplicates {
    static void Main(String[] args)
    {
        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = removeDuplicates(nums);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++)
        {
            // print(nums[i]);
        }

    }

    public static int removeDuplicates(int[] nums)
    {
        int pos = 0;
        int newPos = 0;
        while(pos < nums.length)
        {
            //  if (pos != newPos)
            {
                if (nums[pos] != nums[newPos])
                {
                    nums[++newPos] = nums[pos];

                }
            }
            pos++;

        }

        return newPos;
    }
}
