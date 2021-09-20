import java.util.ArrayList;
import java.util.Scanner;

public class testdtring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> reverse = new ArrayList<Character>();

        System.out.println("Enter a string: ");
        String a = input.nextLine();
        int y=0, x = a.length()-1;
        String result = "";

        while (x>=0){
            reverse.add(a.charAt(x));
            x--;
        }

        while (y<a.length()){
            result += reverse.get(y);
            y++;
        }

        System.out.println(result);
    }
}
