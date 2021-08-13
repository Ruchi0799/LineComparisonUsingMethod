import java.lang.Math;
public class LineComparisonMethod {
    public static void LineEquality(String L1,String L2){

        if(L1.equals(L2))
        {
            System.out.println("Length is equal!");
        }


    }
    public static double CalculateLength(int x1,int x2,int y1,int y2){

        double Length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return Length;
    }
    public static void LineComparison(String L1,String L2){
        int value=L1.compareTo(L2);

        if(value<0)
        {
            System.out.println("Line 2 is Bigger");
        }

        else if(value>0)
        {
            System.out.println("Line 1 is Bigger");
        }

    }
    public static void main(String[] args) {

        int L1x1=4;
        int L1y1=5;
        int L1x2=7;
        int L1y2=9;
        int L2x1=8;
        int L2y1=5;
        int L2x2=13;
        int L2y2=9;
        double Length1=CalculateLength(L1x1,L1x2,L1y1,L1y2);
        double Length2=CalculateLength(L2x1,L2x2,L2y1,L2y2);
        String L1=String.valueOf(Length1);
        String L2=String.valueOf(Length2);
        LineEquality(L1,L2);
        LineComparison(L1,L2);



    }
}
