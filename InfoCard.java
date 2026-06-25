import java.util.Scanner;

public class InfoCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        
         System.out.println("---------Info Card-----------");
        System.out.println("=============================");
        System.out.println(" Name    : " + name);
        System.out.println(" Address : " + address);
        System.out.println(" Phone   : " + phone);
        System.out.println(" Email   : " + email);
        

        sc.close();
    }
}
