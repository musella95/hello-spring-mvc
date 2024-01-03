package org.learning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


@Controller
@RequestMapping("/")
public class DiceController {


    @GetMapping("/")
    public String showRandomNumber(Model model) {
        // Genera un numero casuale tra 1 e 6
        int randomNumber = new Random().nextInt(6) + 1;

        // Passa il numero casuale come attributo del Model
        model.addAttribute("randomNumber", randomNumber);

        // Restituisce il nome del template HTML
        return "dice";
    }

}