package study.javaStudy.javaBasic.ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

//        for (int i = 0; i < library.length; i++) {
//            System.out.println(library[i]);//객체는 null로 초기화
//        }

        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");

        for (Book book: library) {
            System.out.println(book); // 객체를 참조할 주소값이 출ㄺ
            book.showInfo();
        }
    }
}
