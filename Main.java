import java.util.Scanner;
import java.util.Arrays;


class Main {
public static void main(String[] args) {
    int[] new1 = new int[2];
    int[] new2 = new int[2];
    Scanner sc = new Scanner(System.in);
    new1[0] = sc.nextInt();
    new1[1] = sc.nextInt();

    new2[0] = sc.nextInt();
    new2[1] = sc.nextInt();

    sc.close();
    if (Arrays.equals(new1,new2)) {
    System.out.println(true);
} else {
    System.out.println(false);

}
}
}
