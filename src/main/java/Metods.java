import java.util.Arrays;

public class Metods {

    public static int[] afterFour(int[] arr) throws RuntimeException {
        int n = 0;
        String str = Arrays.toString(arr);
        if (str.indexOf(String.valueOf(4)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    n = i;
                }
            }
            int[] arr1 = new int[arr.length - n - 1];
            System.arraycopy(arr, n + 1, arr1, 0, arr1.length);
            return arr1;
        } else {
            throw new RuntimeException("4 не найдена");
        }
    }

    public static boolean oneAndFour(int[] arr) {
        boolean i1 = false, i4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) i1 = true;
            else if (arr[i] == 4) i4 = true;
            else return false;
        }
        return i1 && i4;
    }

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(afterFour(new int[]{1,7,8,8,1,5})));
//        System.out.println(oneAndFour(new int[]{1,1,1,1}));
    }

}
