package org.example;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
//        Class<Book> bookClass = Book.class;
//        Book book = new Book();
//        Class<? extends Book> aClass = book.getClass();
//        try {
//            Class.forName("org.example.Book");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Book book = new Book();
//        Arrays.stream(bookClass.getDeclaredFields())
//                .forEach(f -> {
//                    try {
//                        f.setAccessible(true);
//                        System.out.printf("%s %s\n", f, f.get(book));
//                    } catch(IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
//                });
        Arrays.stream(Book.class.getDeclaredFields())
                .forEach(f -> {
                    Arrays.stream(f.getAnnotations())
                            .forEach(System.out::println);
                });
    }
}
