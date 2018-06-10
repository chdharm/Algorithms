package ArraysString;

public class CircularTours {
    public static void main(String args[]) {
        int n = 3; //no of pumps
        int c = 3; //capacity
        int a [] = { 0, 1, 2 }; //fuel we get
        int b[] = { 2, 2, 1 }; //fuel required

        int start=0;
        int count=0;
        int fuel=0;
        if(a[0]<=c)
            fuel=a[0];
        else
            fuel=c;

        for (int i=0;i<n;i++)
        {
            fuel=fuel-b[i];
            if (i==a.length-1&&fuel>0)
                break;
            if(fuel<0) {
                i = i + 1;
            }
            count++;
            fuel =fillPetrol(fuel,i+1,a);
        }

        if (count>0)
            System.out.println(count);
        else
            System.out.println("NOT VALID");

    }

    public static int  fillPetrol(int fuel,int i,int []a)
    {
        fuel=fuel+a[i];
        return fuel;
    }
}
