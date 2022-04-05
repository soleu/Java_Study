package com.example.homework_4.BookReview;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<>();

    public static BookManager getInstance() {
        return new BookManager();
    }

    public void showMenu() {
        System.out.println("=========MENU=========");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 모든 책 출력");
        System.out.println("4. 종료");
        System.out.println("======================");
        System.out.print("입력 : ");
    }

    public int readInput() {
        int input = sc2.nextInt();
        return input;
    }

    public void enroll() {
        System.out.println("=====책 등록=====");
        System.out.print("책 제목 : ");
        String title = sc1.nextLine();
        System.out.print("평점 : ");
        int rate = sc2.nextInt();
        bookList.add(new Book(title, rate));
        System.out.println("책 등록이 되었습니다.");
    }

    public void search() {
        System.out.println("=====책 검색=====");
        System.out.print("책 제목을 입력하세요 : ");
        String title = sc1.nextLine();
        Book result = null;
        for (Book book : bookList) {
            if (book.title.equals(title)) {
                result = book;
            }
        }
        if (result == null) {
            System.out.println("책 정보가 존재하지 않습니다.");
        } else {
            System.out.println("책 이름 : " + result.title);
            System.out.println("평점 정보 : " + result.rate);
        }
    }

    public void print() {
        System.out.println("=====전체 책 정보 출력=====");
        for (int i = 0; i < bookList.size(); i++) {
            Book bookInfo = bookList.get(i);
            System.out.println(i + 1 + ". " + "책 제목 : " + bookInfo.title + " 평점 : " + bookInfo.rate);
        }
    }
}
