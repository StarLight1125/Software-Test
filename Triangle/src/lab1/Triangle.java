package lab1;

public class Triangle
{

    public static void main(String[] args)
    {
//    	String result=triangle(1, 2, 3);
//    	String result1=triangle(3, 4, 5);
//    	String result2=triangle(6, 6, 6);
//    	String result3=triangle(4, 4, 5);
//    	
//    	System.out.println(result);
//    	System.out.println(result1);
//    	System.out.println(result2);
//    	System.out.println(result3);

    }

    public String triangle(int a, int b, int c)
    {

        if(a >= 0 && b >= 0 && c >=0)
        {
            if(a + b >c && a+c>b && b+c>a & Math.abs(a - b) <c && Math.abs(a-c)<b && Math.abs(b-c)<a)
            {
                if(a == b || b ==c || a ==c)
                {
                    if(a == b && b == c)
                    {
                        return "equilateral";
                    }
                    return "isosceles";
                }
                else
                {
                    return "scalene";
                }
            }
            else
            {
                return "No";
            }
        }
        else
        {
            return "No";
        }
    }


}
