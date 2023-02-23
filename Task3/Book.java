package Task3;

public class Book  {
    String author;
    String title;
    int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }



    public static void main(String[] args) {
        AuthorAndTitle authorAndTitle = new AuthorAndTitle() {
            @Override
            public void authorAndTitle(String author, String title) {
                System.out.println(author + " " + title);
            }
        };

        AuthorAndTitle authorAndTitle2 = (author, title) -> System.out.println(author + " " + title);

        Book book = new Book("Homer", "Odyssey", 420);

        authorAndTitle.authorAndTitle(book.getAuthor(), book.getTitle());
        authorAndTitle2.authorAndTitle(book.getAuthor(), book.getTitle());
    }

}

@FunctionalInterface
interface AuthorAndTitle{
    void authorAndTitle(String author, String Title);
}
