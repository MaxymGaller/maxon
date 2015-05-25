/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxon.tomorrow.service.impl;

import com.maxon.tomorrow.dao.ClientRepository;
import com.maxon.tomorrow.domain.Client;
import com.maxon.tomorrow.service.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maksym_Kotii
 */
@Service
public class ClientServiceImpl implements ClientService {
    
    @Autowired
    ClientRepository repository;
    
    public Client saveClient(Client user){
        return repository.save(user);  
    }
    
     public Client getClient(Long id){
        return repository.findOne(id);  
    }
    
}
