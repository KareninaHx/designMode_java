package org.learn.hq.p2.c3;

/**
 * Created by 27 on 2023/11/12
 */
public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;

    public StringDisplay() {
    }

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.print("+\n");
    }
}
