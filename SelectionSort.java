import java.util.Arrays;

public class SelectionSort {
  public static int[] sort(int[] array)
   {
        if (array.length==0)
        {
            return new int[]{};
        }
        int j=0;
        int smallestIdx;
        while (j< array.length-1)
        {
            smallestIdx=findSmallest(array,j);
            swap(j,smallestIdx,array);
            j++;
        }

        return array;
}
public static int findSmallest(int[] arr,int start)
{
    int smallestElement=arr[start];
    int smallestIdx=start;
    for(int i=start;i<arr.length;i++)
    {
        int currentElement=arr[i];
        if(currentElement<smallestElement)
        {
            smallestElement=currentElement;
            smallestIdx=i;
        }
    }
    return smallestIdx;
}
//this function takes the cuurent index we are at and the smallest idx to swap with
public static void swap(int currentIdx,int smallestIdx,int[] arr)
{
    int temp=arr[currentIdx];
    arr[currentIdx]=arr[smallestIdx];
    arr[smallestIdx]=temp;
}

    public static void main(String[] args) {
        int[] arr={8,5,2,9,5,6,3};
        System.out.println(findSmallest(arr,3));
     //   System.out.println();
     //   swap(0,2,arr);
       // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }
}
