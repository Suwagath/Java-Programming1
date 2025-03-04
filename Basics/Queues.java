package Basics;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        /*Queue<String> bbqLine = new LinkedList<String>();
        bbqLine.add("Jackson");
        bbqLine.add("Tariq");
        bbqLine.add("Susan");

        bbqLine.poll();
        bbqLine.poll();
        bbqLine.poll();
        System.out.println(bbqLine);*/

        Queue<String> q = new LinkedList<String>();
        q.add("A");
        q.add("B");
        q.add("C");
        System.out.println(q.size());
    }
}
