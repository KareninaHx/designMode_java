package org.learn.hq.p1.c1;

/**
 * Created by 27 on 2023/11/11
 */
/*
表示书架的类
 */
public class BookShelf implements Aggregate{
    private Book[] books;// 存储书籍对象的数组
    private int last = 0;// 最后一本

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    /*
    获取书架书籍
     */
    public Book getBook(int index){
        return this.books[index];
    }
    /*
    放入新书籍
     */
    public void appendBook(Book book){
        this.books[last] = book;
        //需要将last 自增
        last++;
    }
    /*
    获取书架长度
     */
    public int getLength(){
        return books.length;
    }
    /*
    创建 迭代器
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
