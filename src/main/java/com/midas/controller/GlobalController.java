package com.midas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 2017/9/13.
 */
@Controller
public class GlobalController {

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/product")
    public String product(){
        return "product";
    }

    @GetMapping(value = "/collection")
    public String collection(){
        return "collection";
    }

    @GetMapping(value = "/group")
    public String group(){
        return "group";
    }






}
