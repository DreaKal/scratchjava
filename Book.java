/**
 Create a class named Book that contains data fields for the title and
 number of pages. Include get and set methods for these fields. Next, create a subclassnamed Textbook,
 which contains an additional field that holds a grade level for the
 Textbook and additional methods to get and set the grade level field. Write an application
 that demonstrates using objects of each class.

 Save the files as Book.java, Textbook.java, and DemoBook.java.*/

public class Book {
    private String theTitle;
    private String numberPages;
    public void setName(String bookName) {
        theTitle = bookName;
    }
    public String getName(){
        return theTitle;
    }
    public void message() {
        System.out.printf("The title of the book named " + theTitle);
    }

    public void setName2(String pages) {
        numberPages = pages;
    }
    public String getName2(){
        return numberPages;
    }
    public void message2() {
        System.out.printf("Wherein the book contains " + numberPages + " pages.");
    }
}