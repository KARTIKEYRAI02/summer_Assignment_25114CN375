import java.util.Arrays;
public class Q65{
    public static void main(String[] args) {
        int[] array1={10,20,30,40,};
        int[] array2={50,60,70,80};
        int length1=array1.length;
        int length2=array2.length;
        int[]mergedArray=new int[length1+length2];
        System.arraycopy(array1,0,mergedArray,0,length1);
        System.arraycopy(array2,0,mergedArray,length1,length2);
        System.out.println("MergedArray:" +Arrays.toString(mergedArray));
    }
}









    






