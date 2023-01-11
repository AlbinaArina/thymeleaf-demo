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
        words.add(new Word("onion", "цибуля", "https://www.kindpng.com/picc/m/5-52172_onion-clipart-onion-slice-onion-clipart-hd-png.png"));
        words.add(new Word("cucumber", "огірок", "https://www.kindpng.com/picc/m/51-516375_ingredient-image-cucumber-for-glowing-skin-hd-png.png"));
        words.add(new Word("melon", "диня", "https://www.kindpng.com/picc/m/153-1534992_cantaloupe-png-clipart-cantaloupe-clipart-png-transparent-png.png"));
        words.add(new Word("watermelon", "кавун", "https://www.kindpng.com/picc/m/52-527308_watermelon-clipart-clipartlook-watermelon-clip-art-hd-png.png"));
        words.add(new Word("pineapple", "ананас", "https://www.kindpng.com/picc/m/3-35402_love-pineapple-pizza-meme-hd-png-download.png"));
        words.add(new Word("tomato", "помідор", "https://www.kindpng.com/picc/m/138-1380513_tomato-png-tomato-clipart-transparent-png.png"));
        words.add(new Word("potato", "картопля", "https://www.kindpng.com/picc/m/68-681976_-yukon-gold-potato-hd-png-download.png"));
        words.add(new Word("corn", "кукурудза", "https://www.kindpng.com/picc/m/111-1110281_corn-png-clipart-transparent-corn-clipart-png-download.png"));
        words.add(new Word("pepper", "перець", "https://www.kindpng.com/picc/m/101-1019240_hot-chili-pepper-tree-clipart-red-chili-pepper.png"));
        words.add(new Word("grapes", "виноград", "https://www.kindpng.com/picc/m/113-1138853_grapes-fruit-with-name-hd-png-download.png"));
    }


    @GetMapping("words")
    String getPeople(Model model) {
        model.addAttribute("words", words);
        return "words";
    }
}
