package org.learn.hq.p1.c1;

/**
 * Created by 27 on 2023/11/11
 */
/*
功能 应用类
 */
public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        Book book = new Book();
        book.setName("java");
        Book book2 = new Book();
        book2.setName("c++");
        Book book3 = new Book();
        book3.setName("C#");
        bookShelf.appendBook(book);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);
        bookShelf.appendBook(new Book("C"));
    //    创建迭代器
    //    BookShelfIterator iterator = new BookShelfIterator(bookShelf);
    //    Book item = (Book) iterator.next();
    //    System.out.println(item.getName());
        Iterator bookShelfIterator = bookShelf.iterator();
            while(bookShelfIterator.hasNext()){
                try{
                    Book item = (Book)bookShelfIterator.next();
                    System.out.println(item.getName());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
    }
}
