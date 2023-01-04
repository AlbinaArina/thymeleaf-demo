package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WordController {

    private List<Word> words;

    {
        words = new ArrayList<>();
        words.add(new Word("apple", "яблуко"));
        words.add(new Word("banana", "банан"));
        words.add(new Word("onion", "цибуля"));
        words.add(new Word("cucumber", "огірок"));
        words.add(new Word("melon", "диня"));
        words.add(new Word("watermelon", "кавун"));
        words.add(new Word("pineapple", "ананас"));
        words.add(new Word("tomato", "помідор"));
        words.add(new Word("potato", "картопля"));
        words.add(new Word("corn", "кукурудза"));
        words.add(new Word("pepper", "перець"));
        words.add(new Word("grapes", "виноград"));

//        Image image = null;
//        URL url = new URL("http://bks6.books.google.ca/books?id=5VTBuvfZDyoC&printsec=frontcover&img=1& zoom=5&edge=curl&source=gbs_api");
//        image = ImageIO.read(url);
//
//
//        Image img = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL);
    }


    @GetMapping("words")
    String getPeople(Model model) {
        model.addAttribute("words", words);
        return "words";
    }
}
