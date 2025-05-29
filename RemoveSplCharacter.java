import java.util.Scanner;
//	Remove All Special Characters
public class RemoveSplCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch) || ch==' ') {
                word.append(ch);
            }
        }
        System.out.println(word);
        sc.close();
    }
}
