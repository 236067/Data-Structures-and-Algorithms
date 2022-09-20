import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_2 {
    //leetcode 面试10.05

    /*words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
      输出：-1
      输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
      输出：4
    */
    public static void main(String[] args) {
        String []words={"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""};
        String s="ball";
        int result=new Solution().findString(words,s);
        System.out.println(result);
    }
    static class Solution {
        public int findString(String[] words, String s) {
            int sum=0;
            Map<Integer,String>map=new HashMap<>();
            List<String>list=new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if(!words[i].equals("")){
                    sum++;
                    map.put(i,words[i]);
                    list.add(String.valueOf(i));
                }
            }

            if(map.containsValue(s)) {
                String[][] array = new String[sum + 1][2];
                array[0][0]= String.valueOf(words.length);
                array[0][1]= String.valueOf(sum);

                for(int i=0;i<sum;i++){
                    array[i+1][0]= list.get(i);
                    array[i+1][1]=words[Integer.parseInt(list.get(i))];
                    if(s.equals(array[i+1][1])){
                        return Integer.valueOf(array[i+1][0]);
                    }
                }

            }
            return -1;

        }
    }

    /*
    * 不使用稀疏数组
    *       class Solution {
    public int findString(String[] words, String s) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) continue;
            if (s.equals(words[i])) return i;
        }
        return -1;
    }
}
    *
    *
    *
    *
    *
    *
    *
    * */



}
