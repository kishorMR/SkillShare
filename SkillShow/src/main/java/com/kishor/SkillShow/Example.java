package com.kishor.SkillShow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @GetMapping("hello")
    public String getMessage(){
        return "this is just message";
    }
    
}
