package com.maxon.tomorrow.controller;

import com.maxon.tomorrow.domain.Client;
import com.maxon.tomorrow.service.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/**
 * @author maxon
 */
@Controller
public class HomeController {
    
    @Autowired
    ClientService userService;
    
    @RequestMapping("/hello")
        String home() {
    
        userService.saveClient(new Client("Jack", "Bauer"));
            
        return "main";
    }
  
     @RequestMapping("/user")
        String viewClient() {
    
        Client user = userService.getClient(1L);
            if (1==1)
                throw new RuntimeException(user.getEmail());
        return "home";
    }
        
}
