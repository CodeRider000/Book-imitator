class Book{
    String bookName,authorName,publisher;
    int isbn;
    Book(String bn , String an, String p , int i){
        bookName = bn;
        authorName = an;
        publisher = p;
        isbn = i;
    }
    Book(){
        bookName = "";
        authorName = "";
        publisher = "";
        isbn = 0;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getBookName() {
        return bookName;
    }
    public int getIsbn() {
        return isbn;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }public void setIsbn(int isbn) {
        this.isbn = isbn;
    } 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getBookInfo(){
        String info = "ISBN :"+this.isbn+" Book name : "+this.bookName+" Author Name: "+this.authorName+" Publisher : "+this.publisher;
        return info;

    }
}

class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Indian Girl","Chetan Bhagat", "Chetan Publications" , 19125672);
        Book book2 = new Book();
        int j;
        book1.setBookName("University Of Success");
        book2.setAuthorName("Dale Nortan");
        book2.setPublisher("Wish Publications");
        book2.setIsbn(19284903);
        book2.getBookInfo();
        Book bookArray[] = new Book[30];
        bookArray[0] = book1;
        bookArray[1] = book2;
        for(j=0;j<30;j++){
            System.out.println(bookArray[j].getBookInfo());
        }
    }
}