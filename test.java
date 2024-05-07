import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] test = {1,2,3};
        int[] t = test;
        t[0] = 1000;
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(t));
    }
}
