import java.util.ArrayList;
public class library {
    public static void main(String[] args){
        ArrayList<Book> bookListA = new ArrayList<Book>();
        ArrayList<Book> bookListCopyA = new ArrayList<Book>();
        ArrayList<Book> bookListB = new ArrayList<Book>();

        bookListA.add(new Book("태백산맥","조정래"));
        bookListA.add(new Book("이기적 유전자","리처드 도킨즈"));
        bookListA.add(new Book("자전거 도둑","박완서"));
        bookListA.add(new Book("토지","박경리"));
        bookListA.add(new Book("대변동","제레드 다이아몬드"));
        for(int i= 0; i<bookListA.size(); i++){
            bookListCopyA.add(bookListA.get(i));
            bookListB.add(bookListA.get(i));
        }
        System.out.println(bookListA);
        System.out.println(bookListCopyA);
        System.out.println(bookListB);
        bookListA.set(2,new Book("그 많던 싱아는 누가 다 먹었을까","박완서"));
        bookListB.add(new Book("사피엔스","유발 하라리"));
        System.out.println(bookListA);
        System.out.println(bookListCopyA);
        System.out.println(bookListB);

    }
}

class Book extends library{
    private String title;
    private String writer;
    public Book(String title, String writer){
        this.title = title;
        this.writer = writer;
    }
    public String toString(){
        return"[" + this.title + ": " + this.writer + "]";
    }
}
