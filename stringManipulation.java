import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String y = input.nextLine();
        Integer x = 0;
        Integer space = 0;
        Integer digit =0;
        Integer ch = 0;

        while(x<y.length()){
            
            if (y.charAt(x)==' '){
                space++;
            }
            else if(Character.getNumericValue(y.charAt(x)) == 1 | Character.getNumericValue(y.charAt(x)) == 2 | Character.getNumericValue(y.charAt(x)) == 3 | Character.getNumericValue(y.charAt(x)) == 4 | Character.getNumericValue(y.charAt(x)) == 5 | Character.getNumericValue(y.charAt(x)) == 6 | Character.getNumericValue(y.charAt(x)) == 7 | Character.getNumericValue(y.charAt(x)) == 8 | Character.getNumericValue(y.charAt(x)) == 9){
                digit++;
            }
            else{
                ch++;
            }
            x++;
        }

        System.out.println(space +" "+ digit +" "+ch);

    }
}
