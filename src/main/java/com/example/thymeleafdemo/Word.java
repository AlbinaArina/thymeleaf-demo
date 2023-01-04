package com.example.thymeleafdemo;

public class Word {

    private String word;
    private String translation;
    private String imageLink;

    public Word(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public Word(String word, String translation, String imageLink) {
        this.word = word;
        this.translation = translation;
        this.imageLink = imageLink;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
