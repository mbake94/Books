public class BookApp {
    public static void main(String[] args){
        Book book1 = new Book();
        System.out.printf("Title: %s\nAuthor: %s\nDescription: %s\nPrice: %.2f\nIn Stock: %b", book1.getTitle(), book1.getAuthor(), book1.getDescription(), book1.getPrice(), book1.isInStock());
    }
}
