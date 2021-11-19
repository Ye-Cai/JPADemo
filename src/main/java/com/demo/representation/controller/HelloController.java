package com.demo.representation.controller;

import com.demo.representation.application.HelloApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class HelloController {
    private final HelloApplication helloApplication;

    @GetMapping(
            value = "/testSave",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void testSave() {
        helloApplication.testSave();
    }
}
