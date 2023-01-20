public class H {
    private int[] arrayInt;
    private H[] arrayObj;
    private int[] twoArrays;

    private String Name;
    private int Age;

    public H() {
    }

    public H(String name, int age) {
        Name = name;
        Age = age;
    }

    //    Q1
    public int[] copyInt(int[] array) {
        arrayInt = new int[array.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = array[i];
        }
        return arrayInt;
    }

    //    Q2
    public H[] copyObj(H[] obj) {
        arrayObj = new H[obj.length];

        arrayObj = obj;
        return arrayObj;
    }

    @Override
    public String toString() {
        return "H{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    //    Q3
    public int[] TwoArrays(int[] array1, int[] array2) {
        twoArrays = new int[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            twoArrays[i] = array1[i];
            counter++;
        }
        for (int i = 0; i < array2.length; i++) {
            twoArrays[counter + i] = array2[i];
        }
        return twoArrays;
    }

    //    Q4
    public boolean EqualsArrays(int[] array1, int[] array2)
    {
      if (array1.length==array2.length)
      {
          for (int i = 0; i < array1.length; i++)
          {
          if (array1[i]==array2[i])
              return true;
              break;
          }
      }
      return false;
    }
}
