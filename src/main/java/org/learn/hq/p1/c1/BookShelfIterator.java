package org.learn.hq.p1.c1;

/**
 * Created by 27 on 2023/11/11
 */
/*
表示 遍历书架的类
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        //获取第一个元素
        Book book = bookShelf.getBook(index);
        index++;
        return book;
    }
}
