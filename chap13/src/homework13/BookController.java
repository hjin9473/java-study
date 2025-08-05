package homework13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
    private List<Book> bk = new ArrayList<>();

    public BookController() {
        bk.add(new Book("느리게 나이드는 습관", "정희원", "인문", 16200));
        bk.add(new Book("코스모스", "칼 세이건", "자연과학", 17910));
        bk.add(new Book("나에게 들려주는 예쁜 말", "김종원", "어린이", 15610));
        bk.add(new Book("혼자 공부하는 자바", "신용권", "기타", 25240));
    }

    public void insertBook(Book book) {
        bk.add(book);
    }

    public List<Book> selectList() {
        return bk;
    }

    public List<Book> searchBook(String keyword) {
        List<Book> searchList = new ArrayList<>();
        for (Book b : bk) {
            if (b.getTitle().contains(keyword)) {
                searchList.add(b);
            }
        }
        return searchList;
    }

    public Book deleteBook(String title, String author) {
        for (Book b : bk) {
            if (b.getTitle().equals(title) && b.getAuthor().equals(author)) {
                bk.remove(b);
                return b;
            }
        }
        return null;
    }

    public int ascBook() {
        try {
            Collections.sort(bk);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
