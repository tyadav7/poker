package com.example.controller;

import com.example.model.Card;
import com.example.service.Deck;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    private final Deck deck;

    @GetMapping("/shuffle")
    public void shuffle() {
        this.deck.shuffle();
    }

    @GetMapping("/deal")
    public Card deal() {
        return this.deck.deal();
    }
}
