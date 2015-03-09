/**
 * Created by jc143867 on 9/03/15.
 */
//**
// * Text viewer App - prints the contents of a string to the console
// *   Created by Phil McGee 9/3/2015
// */

 public class Part1 {
    public static void main(String[] args){
        String text = "This is a simple test\nOne Two Three\nHello world!";
        for (int i=0; i < text.length(); ++i){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
