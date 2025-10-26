package com.example.svg.scrape.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyScraper {

public String scrapeTag(String ...tag){

    WebDriver driver = new ChromeDriver();

    driver.get("https://books.toscrape.com/");

    String text = driver.findElements(By.tagName("small")).stream().map(WebElement::getText).collect(Collectors.joining(" "));

    driver.quit();

    return text;
}

}
