package nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount = 0;

    // create Library constructor
    public Library(int size) {
        books = new Book[size];
    }

    // Book 내부 클래스, Library 클래스에서만 쓰임으로 private 지정
    // Library 클래스는 Book 객체 배열을 사용해서 도서 목록 관리
    // Book 클래스가 Library 클래스의 인스턴스를 사용하지 않는다. 따라서 static으로 선언
    // 정적 중첩 클래스 : 바깥 인스턴스에 대한 숨은 참조가 없음. 바깥 클래스의 인스턴스 멤버에 직접 접근할 수 없음.
    // 바깥 인스터스 없이 독립적으로 생성 가능
    private static class Book {

        private String title;
        private String author;


        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author){
        // 예외로직 먼저 처리
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 정상 로직 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks(){
        if(bookCount == 0){
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }
}
