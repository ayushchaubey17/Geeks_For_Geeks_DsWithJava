import java.util.ArrayList;

public class snake {

    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {27, 29, 47, 48}, {32, 33, 39, 50}};

        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();

int sum =0;
        // row
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < n; j++) {


                if (j<=i) {
                   sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
