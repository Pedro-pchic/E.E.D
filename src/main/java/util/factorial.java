package util;

public class factorial {

    public static int factorialInterativo(int n) {
        int total = 1;
        for(int  i = n; i > 1; i-- )
            total *=i;

        return total;
    }
}
