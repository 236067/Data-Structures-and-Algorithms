public class Test {
        /* 0 0 0 0 0
           0 0 0 0 1
           2 0 0 0 0
         */

    /*  0 3 5 2
     *  1 1 4 1
     *  2 2 0 2
     */


    public static void main(String[] args) {

        int [][]arr=new int[3][5];
        arr[1][4]=1;
        arr[2][0]=2;

        int sum=0;
        System.out.println("原始数组：");
        for(int []i:arr){
            for (int a:i){
                System.out.printf("%d\t",a);
                if(a!=0){
                    sum++;
                }
            }
            System.out.println("\n");
        }

        System.out.println("稀疏数组：");

        int [][]arr_New=new int[sum+1][3];
        int count=0;

        arr_New[0][0]=3;
        arr_New[0][1]=5;
        arr_New[0][2]=sum;
        for(int i=1;i<3;i++){
            for (int j=0;j<5;j++){
                if(arr[i][j]!=0){
                    count++;
                    arr_New[count][0]=i;
                    arr_New[count][1]=j;
                    arr_New[count][2]=arr[i][j];
                }
            }
        }

        for(int []i:arr_New){
            for (int a:i){
                System.out.printf("%d\t",a);
            }
            System.out.println("\n");
        }


        //稀疏数组还原
        System.out.println("数组还原：");

        int [][]arr_New2=new int[arr_New[0][0]][arr_New[0][1]];
        for(int i=0;i<arr_New[0][2];i++){
            arr_New2[arr_New[i+1][0]][arr_New[i+1][1]]=arr_New[i+1][2];
        }
        for(int []i:arr){
            for (int a:i){
                System.out.printf("%d\t",a);
            }
            System.out.println("\n");
        }

    }
}
