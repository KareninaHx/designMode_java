package org.learn.hq.p2.c3;

/**
 * Created by 27 on 2023/11/12
 */
public class DisplayMain {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay = new CharDisplay('c');
        abstractDisplay.display();
        System.out.println("\n============================");
        AbstractDisplay abstractDisplay1 = new StringDisplay("hello,world");
        abstractDisplay1.display();
    }


}
