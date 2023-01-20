import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        H Method=new H();
//        Q1
        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(Method.copyInt(array)));

//        Q2
         H[] obj=new H[2];
         obj[0] =new H("Mohammed",10);
         obj[1] =new H("Ahmed",20);

        System.out.println(Arrays.toString(Method.copyObj(obj)));

//        Q3
        int[] array1={1,2,3,4,5};
        int[] array2={1,2,3,4,5};
        System.out.println(Arrays.toString(Method.TwoArrays(array1,array2)));

//        Q4
        if (Method.EqualsArrays(array1,array2) == true) {
            System.out.println("Equals");
        }
        else System.out.println("Not Equals");

    }
}
