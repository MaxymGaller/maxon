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
    ClientService clientService;
    
    @RequestMapping("/hello")
        String home() {
    
        clientService.saveClient(new Client("Jack", "Bauer"));
            
        return "main";
    }
  
     @RequestMapping("/user")
        String viewClient() {
    
        Client user = clientService.getClient(1L);
           
        return "home";
    }
        
}
