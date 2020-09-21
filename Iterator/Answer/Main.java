public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.appendBook(new Book("半沢直樹シリーズ1"));
    bookShelf.appendBook(new Book("半沢直樹シリーズ2"));
    bookShelf.appendBook(new Book("半沢直樹シリーズ3"));
    bookShelf.appendBook(new Book("半沢直樹シリーズ4"));
    bookShelf.appendBook(new Book("半沢直樹シリーズ5"));
    bookShelf.appendBook(new Book("半沢直樹シリーズ6"));
    bookShelf.appendBook(new Book("半沢直樹シリーズ7"));

    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}
