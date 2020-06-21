/**
 * 二分查找
 */
public static int find(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return lo;
}

private static long findMax/Min(long[] nums){
        long $initial = nums[0];
        for( long num: nums ){
            if ($condition)
                $initial = num;
        }
        return $initial;
}