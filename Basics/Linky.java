package Basics;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<String>();

        linky.add("Rob");
        linky.add("Alex");
        linky.add("MCRG");

        System.out.println(linky.get(1));


        Iterator it = linky.iterator();
        while (it.hasNext()) {
            if ((int)it.next() == 78);
            System.out.println("We found 78");
        }
    }
}
