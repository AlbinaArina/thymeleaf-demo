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
        words.add(new Word("apple", "яблуко", "https://www.kindpng.com/picc/m/372-3727789_caramel-apple-clip-art-red-apple-images-clip.png"));
        words.add(new Word("banana", "банан", "https://www.kindpng.com/picc/m/128-1288078_banana-education-fruit-school-peeled-banana-cartoon-png.png"));
        words.add(new Word("onion", "цибуля", "https://www.kindpng.com/picc/m/5-52172_onion-clipart-onion-slice-onion-clipart-hd-png.png"));words.add(new Word("cucumber", "огірок"));
        words.add(new Word("melon", "диня"));
        words.add(new Word("watermelon", "кавун"));
        words.add(new Word("pineapple", "ананас"));
        words.add(new Word("tomato", "помідор"));
        words.add(new Word("potato", "картопля"));
        words.add(new Word("corn", "кукурудза"));
        words.add(new Word("pepper", "перець"));
        words.add(new Word("grapes", "виноград"));
    }


    @GetMapping("words")
    String getPeople(Model model) {
        model.addAttribute("words", words);
        return "words";
    }
}
