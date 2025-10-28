package com.example.svg.scrape.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormService {

    public String showForm(){
        String form ="<form action=\"/getForm\" method=\"POST\">" +
                " <input type=\"text\" name=\"inputTxt\">" +
                " <button type=\"submit\">Submit</button>" +
                "</form>";

        return form;
    }

}
