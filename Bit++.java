import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[t];
        int x = 0;

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextLine();
//            scanner.nextLine();
        }

        for (String s : array) {
            String substring = s.substring((s.length() - 2));
            if (s.startsWith("++") ||
                    substring.equals("++")) {
                x++;
            } else if (s.startsWith("--") ||
                    substring.equals("--")) {
                x--;
            }
        }

        System.out.println(x);
    }
}
