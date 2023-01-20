import java.util.Arrays;
import java.util.Random;
public class h1
{
//    H1
    public void Revers(int array[])
    {
        int j = array.length-1;
        for(int i = 0; i < j/2; i++)
        {
            array[i] = array[i] + array[j-i];
            array[j-i] = array[i] - array[j-i];
            array[i] = array[i] - array[j-i];
        }

        System.out.println(Arrays.toString(array));
    }
//    H2
    public void clone(int[] array)
    {
        int[] array2 = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
    }
//    H3
    public String[] Remove(String [] arr)
    {
        Random r = new Random();
        while(arr.length > 0){
            String []a = new String[arr.length -1];
            int index = r.nextInt(arr.length);
            for(int i = 0; i < index; i++){
                a[i] = arr[i];
            }
            for(int i = index; i < arr.length - 1; i++){
                a[i] = arr[i + 1];
            }
            arr = a;
        }
        return arr;
    }

}

