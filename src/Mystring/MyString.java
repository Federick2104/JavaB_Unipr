package src.Mystring;

public class MyString {
    private char[] chars;

    public MyString() {
        chars = null;
    }

    public MyString(String s) {
        chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyString that = (MyString) o;
        if (chars.length != that.chars.length) {
            return false;
        }
        int[] charCounts = new int[256];
        for (char c : chars) {
            charCounts[c]++;
        }
        for (char c : that.chars) {
            charCounts[c]--;
        }
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}
