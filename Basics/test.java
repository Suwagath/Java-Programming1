package Basics;

public class test {
    public static void main(String[] args) {
        /*int ddd = 2;
        int kkk = 1;
        arrange(kkk, ddd);*/

      /*  for (int i = 1; i < 101; i++) {
            if (i == 35 || i == 70) {
                continue;
            }
            System.out.println(i);
        }*/

       /* int i = 1;

        while (i < 101) {
            System.out.println(i);
            i+=2;
        }*/

        String r = reverse("Hello");
        System.out.println(r);
    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int letterIndex = 0;

        for (int i = s.length() - 1; i >= 0 ; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        String reversed = "";
        for (int i = 0; i < s.length(); i++) {
            reversed  = reversed + letters[i];
        }

        return reversed;
    }


}
