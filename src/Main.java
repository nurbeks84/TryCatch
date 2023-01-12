import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10};
        int a1 = array.length;
        int b1 = array2.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        System.arraycopy(array, 0, c, 0, a1);
        System.arraycopy(array2, 0, c, a1, b1);
        Arrays.sort(c);
        System.out.println(c[c.length-1]);
    }
}

