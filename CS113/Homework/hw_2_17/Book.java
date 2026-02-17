package CS113.Homework.hw_2_17;
public class Book {
    
   String title;
   int pages;

   public Book() {
      title = "Java Programming";
      pages = 200;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setPages(int newPages) {
        pages = newPages;
    }

    public String toString() {
        return "Title: " + title + " | Pages: " + pages;
    }
}