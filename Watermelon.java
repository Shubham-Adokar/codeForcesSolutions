import java.util.Scanner;
 
public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N>2 && N%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
