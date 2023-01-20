import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};
        String[] arrayS ={"1","2","3","4","5"};

        h1 h=new h1();

//        H1
        h.Revers(array);

//        H2
        h.clone(array);

//      H3
        h.Remove(arrayS);
        arrayS = h.Remove(arrayS);
        System.out.println(Arrays.toString(arrayS));

    }
}
