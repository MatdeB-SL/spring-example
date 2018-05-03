package com.example.demo.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    public int doBusinessThing(int i){
        return itemService.addFivetoNumber(i);
    }


}
