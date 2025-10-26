package com.example.svg.scrape.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

    public String Hello(){
        return "Hello";
    }
}
