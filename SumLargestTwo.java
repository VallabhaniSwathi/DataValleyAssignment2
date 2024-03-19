import java.util.Arrays;

public class Sum_largest_two{
    public static void main(String[] args) {
        int[] num = {20, 31, 83, 19, 77, 24, 91};
        Arrays.sort(num);
        int second_Large = num[num.length - 2];
        int third_Large = num[num.length - 3];
        int sum = second_Large + third_Large;
        System.out.println(sum);
    }
}
