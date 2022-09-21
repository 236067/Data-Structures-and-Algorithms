import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {

        int []nums1={1,0,0,2,3};
        int []nums2={0,3,0,4,0};
        SparseVector v1 = new SparseVector(nums1);
        SparseVector v2 = new SparseVector(nums2);
        int ans = v1.dotProduct(v2);
        System.out.println(ans);
    }

    static class SparseVector {
        private  int[]nums;
        private Map<Integer,Integer> map=new HashMap<>();
        SparseVector(int[] nums) {
          this.nums=nums;
          for(int i=0;i< nums.length;i++){
              if(nums[i]!=0){
                  map.put(i,nums[i]);
              }
          }
        }
        // Return the dotProduct of two sparse vectors
        public int dotProduct(SparseVector vec) {
            int arry=0;
            for(Integer i: map.keySet()){
                if(vec.map.get(i)!=null){
                    arry+=map.get(i)*vec.map.get(i);
                }
            }
            return arry;
        }
    }

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);

}
