import java.util.Arrays;

public class BubbleSort
{
    public static int[] sort(int[] array)
    {
        if (array.length==0)
        {
            return new int[]{};
        }
        int right= array.length -1;
        while (right>0)
        {
            for (int i=0;i<right;i++)
            {
                if(array[i]>array[i+1])
                {
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            right--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr={5,8,2,9,5,6,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
