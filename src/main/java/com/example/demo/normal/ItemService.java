package com.example.demo.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemDAO itemDAO;

    public int addFivetoNumber(int input){
        int result = input + 5;
        return itemDAO.saveItem(result);
    }

}
