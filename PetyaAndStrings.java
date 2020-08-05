import java.util.Scanner;

public class PetyaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oneInitial = scanner.nextLine();
        String twoInitial = scanner.nextLine();
        String one = oneInitial.toLowerCase();
        String two = twoInitial.toLowerCase();

        if(one.compareTo(two)==0){
            System.out.println("0");
        }else if(one.compareTo(two)>0){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }
    }
}
