package Basics;

public class Encrypt {
    public static void main(String[] args) {
        // Let's declare was on Alex
        int key = 6;
       /* String txt = "hey, how's it hangin?";

        System.out.println(txt);

        char[] chars = txt.toCharArray();
        for (char c : chars) {
            c += key;
            System.out.print(c);
        }*/

        String txt = "nk\\u007F2&nu}-y&oz&ngtmotE";
        System.out.println(txt);

        char[] chars = txt.toCharArray();

        for (char c : chars) {
            c -= key;
            System.out.println(c);
        }

    }
}
