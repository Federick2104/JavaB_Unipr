package src.Mystring;

public class MainMyString {
    public static void main(String[] args) {
        MyString s1 = new MyString("AndreaMunaro");
        MyString s2 = new MyString("oranuMaerdnA");

        System.out.println(s1.equals(s2)); // Stampa true
        System.out.println(s1.equals(new MyString("Arceri"))); // Stampa false
    }
}
