package io.indrek.puzzlers;

public class NewLine {
    public static void main(String[] args) {
        // \u000B is a unicode escape for the line feed (LF)
        // \u0055 is a Unicode escape for the capital U character (U)
        System.out.println("Hello \u0055nicode".length());
    }
}
