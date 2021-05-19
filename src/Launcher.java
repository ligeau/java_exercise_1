import java.util.Scanner;
public class Launcher {

static int myfibo(int n){
    int u0 = 0;
    int u1 = 1;
    if (n == 0)
    {
        return u0;
    }
    if (n == 1)
    {
        return u1;
    }
    for (int i = 1; i < n; ++i)
    {
        u0 = u0 + u1;
        int t = u0;
        u0= u1;
        u1 = t;
    }
    return u1;
}

    public static void main(String[] args) {
        System.out.println("un texte de bienvenue");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while (!str.equals("quit")) {
            if (str.equals("fibo")) {
                System.out.println(myfibo(scan.nextInt()));
                scan.nextLine();
            }
            else {
                System.out.println("Unknown command");
            }
            str = scan.nextLine();
        }
    }
}
