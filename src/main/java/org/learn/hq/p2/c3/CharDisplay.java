package org.learn.hq.p2.c3;

/**
 * Created by 27 on 2023/11/12
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
