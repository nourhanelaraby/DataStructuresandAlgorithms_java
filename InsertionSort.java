import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] arr)
    {
        if (arr.length!=0)
        {
            for(int i=1;i< arr.length;i++)
            {
                int key=arr[i];
                int iterator=i-1;
                while (iterator>=0&&key<arr[iterator])
                {
                    int temp=key;
                    arr[iterator+1]=arr[iterator];
                    arr[iterator]=temp;
                    iterator--;
                }
            }
            return arr;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr={8,5,2,9,5,6,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
