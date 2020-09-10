import java.util.Scanner;

public class Testing {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something: ");
        String line = in.nextLine();
        System.out.println("Hello world " + line + "!");
    }


}
