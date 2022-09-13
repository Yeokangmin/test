package my.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class testController {


    @GetMapping("get")
    public String test(){
        return "hello";
    }

    @PostMapping("post")
    public String test2(
            @RequestParam(value = "name") String name
    ){
        return name;
    }

}


