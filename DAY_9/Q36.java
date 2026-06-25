public class Q36{
    public static void printsq(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                if (i==1 || i==size || j==1 || j==size)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        printsq(5);
    }
}