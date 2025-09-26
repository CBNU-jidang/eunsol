package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody   // 문자 index를 리턴한다는 의미
    public String home() {
        return "index";  // templates/index.html을 리턴한다는 의미
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
