package io.dougluciano.skelleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Test testController(){
        Test test = new Test();
        test.setName("I'm working!!! Lombok's working!");

        return test;
    }
}
