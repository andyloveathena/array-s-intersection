import java.util.ArrayList;

public class Second {
    // %餘數
    // /整數
    public static int[] intersection(int[] arr1, int[] arr2){
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    arr.add(arr1[i]);

                }
            }
        }
        int [] result = new int[arr.size()];
        for(int i=0;i< result.length;i++){
            result[i]=arr.get(i);


        }
        return result;


    }



    public static void main(String[] args) {
        int[] intersect = intersection(new int[] {1, 3, 4, 6, 10}, new int[] {5, 11, 4, 3, 100, 144, 0});
        for(int i : intersect){
            System.out.print(i+ " " );

        }







    }
}