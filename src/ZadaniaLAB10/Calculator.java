package ZadaniaLAB10;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res1 = calc.add(1,2);
        double res2 = calc.add(1.0,2.4,3.4);
        System.out.println(res1);
        System.out.println(res2);
    }


   int add(int x, int y)
    {
        return x+y;

    }

    int add(int x, int y, int z)
    {
        return x+y+z;

    }
    double add(double x, double y)
    {
        return x+y;

    }

    double add(double x, double y, double z)
    {
       return x+y+z;

    }
}

