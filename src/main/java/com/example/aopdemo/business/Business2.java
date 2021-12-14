package com.example.aopdemo.business;

import com.example.aopdemo.dao.Dao2;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

//    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        return dao2.retrieveSomething();
    }
}
