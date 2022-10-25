package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;




public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Tekst", text -> "abc".toUpperCase() + text + "abc".toUpperCase());
        poemBeautifier.beautify("STRING TO LOWER CASE", text -> text.toLowerCase());
        poemBeautifier.beautify("text", text -> "ABC >".toLowerCase() + text + "< ABC".toLowerCase());

    }
}
