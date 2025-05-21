public class Textbook extends Book{
    private String grLvl;
    public void setName3(String txtbook){
        grLvl = txtbook;
    }
    public String getName3(){
        return grLvl;
    }
    public void message3() {
        System.out.printf("This book is for grade " + grLvl + " level.");
    }
}
