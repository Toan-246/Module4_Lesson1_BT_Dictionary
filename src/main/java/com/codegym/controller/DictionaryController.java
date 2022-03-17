package com.codegym.controller;

import com.codegym.model.IDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {
    @Autowired
    IDictionary dictionaryService;

    @GetMapping("/dictionary")
    String showSearchForm() {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public ModelAndView search(@RequestParam String keyWord) {
        String result = dictionaryService.search(keyWord);
        ModelAndView modelAndView = new ModelAndView("dictionary");
        if (result == null) {
            result = "khong tim thay";
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
