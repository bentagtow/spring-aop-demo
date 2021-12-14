package com.example.aopdemo.business;

import com.example.aopdemo.dao.Dao1;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

//    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        return dao1.retrieveSomething();
    }
}
