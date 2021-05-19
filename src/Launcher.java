import java.util.Scanner;
public class Launcher {

    public static void main(String[] args) {
        System.out.println("un texte de bienvenue");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while (!str.equals("quit"))
        {
            System.out.println("Unknown command");
            str = scan.nextLine();
        }
    }
}
