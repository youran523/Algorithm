import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TowSum {
    public static void main(String[] args) {
        int[] nums = new int[] {3,3};
        int[] select = twoSUm( nums, 6);
    }
    public static  int[] twoSUm ( int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>() ;
        for(int i =0 ; i< nums.length ; i++) {
            int value = target - nums[i];
            if(map.containsKey(value)) {
                result[0] = i;
                result[1] = map.get(value);
                break;
            }
            map.put(nums[i],i);
        }
        return result;

    }


}
