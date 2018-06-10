package ArraysString;

import java.util.ArrayList;
import java.util.List;

public class RecursiveWords {
    public static void main(String[] args) {
        String [][]a=new String[][]{
            {"a","b","c"},
            { "d","e","f"},
            {"g","h","i"}
        };
    String find="abcf";
    char start=find.charAt(0);
    List<Integer> vertex =findxy(start,a);
    int x=vertex.get(0);
    int y=vertex.get(1);
    int count=0;
    int res;
    String[][] sol=new String[100][100];

    if (x==-1 && y==-1)
        System.out.println("NOT");
    else {
        res = solveMaze(a, x, y, count, find, sol);
        if (res==1)
            System.out.println("EXISTS");
        else
            System.out.println("NOT");
    }

    }

    public static int solveMaze(String[][] a,int x, int y, int count, String find,String[][] sol)
    {
        if (count==find.length())
        {
            return 1;
        }
        char c=find.charAt(count);
        if(isSafe(a,x,y,c))
        {
            sol[x][y]=String.valueOf(c);
            count++;
            if(solveMaze(a,x+1,y,count,find,sol)==1)
                return 1;
            if(solveMaze(a,x,y+1,count,find,sol)==1)
                return 1;
            if(solveMaze(a,x-1,y,count,find,sol)==1)
                return 1;
            if(solveMaze(a,x,y-1,count,find,sol)==1)
                return 1;
            sol[x][y]="\0";//backtracking
            return -1;

        }
        return -1;
    }

    public static boolean isSafe(String a[][], int x, int y, char c)
    {
        if(x>=0&&x<a.length&&y>=0&&y<a.length&&a[x][y].equals(String.valueOf(c)))
            return true;
        return false;

    }
    public static List<Integer> findxy(char start, String[][]a)
    {
        List<Integer> vertexList=new ArrayList<>();
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                if (a[i][j].equals(String.valueOf(start)))
                {

                    vertexList.add(i);
                    vertexList.add(j);
                    return vertexList;
                }
            }
        }
        vertexList.add(-1);
        vertexList.add(-1);
        return vertexList;
    }
}
