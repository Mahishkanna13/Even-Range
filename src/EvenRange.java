import java.util.Scanner;

public class EvenRange {
    public static int[] EvenNumber(int[] Array, int[][] Query, int Range)
   {
       int count=0;
       int Result[]=new int[Range];
        for(int i=0;i<Range;i++)
        {
            int First=Query[i][0];
            int Last=Query[i][1];
            System.out.println(First);
            System.out.println(Last);
            for(int j=First;j<=Last;j++)
            {
                if(Array[j]%2==0)
                {

                    count++;
                }
            }
            Result[i]=count;
            count=0;

        }
        return Result;
   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        int Query=scanner.nextInt();
        int Range[][]=new int[Query][2];
        for (int i=0;i<Query;i++)
        {
            for(int j=0;j<2;j++)
            {
                Range[i][j]=scanner.nextInt();
            }
        }
        int Output[]=EvenNumber(array,Range,Query);
        for(int j=0;j<Output.length;j++)
        {
            System.out.println(Output[j]);
        }



    }
}
