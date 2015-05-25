/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxon.tomorrow.service.api;

import com.maxon.tomorrow.domain.Client;

/**
 *
 * @author Maksym_Kotii
 */
public interface ClientService {
    
     public Client saveClient(Client user);
    
     public Client getClient(Long id);
    
}
