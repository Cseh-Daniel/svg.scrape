package com.example.svg.scrape.controller;

import com.example.svg.scrape.service.FormService;
import com.example.svg.scrape.service.MyScraper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ScrapeController {

    private final MyScraper myScraper;
    private final FormService formService;

    @GetMapping("/scrape-books")
    public String scrapeBooks(){
        return myScraper.scrapeTag("https://books.toscrape.com/","small");
    }

    @GetMapping("/getForm")
    public String getForm(){
        return "form";
    }

    @PostMapping("/getForm")
    @ResponseBody
    public String postForm(@RequestParam String inputTxt){
        return "Form submitted --> "+inputTxt;
    }

}
