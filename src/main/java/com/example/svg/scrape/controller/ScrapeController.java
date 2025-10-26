package com.example.svg.scrape.controller;

import com.example.svg.scrape.service.MyScraper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScrapeController {

    private final MyScraper myScraper;

    @GetMapping("/scrape-books")
    public String scrapeBooks(){
        return myScraper.scrapeTag("alma");
    }

}
