/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxon.tomorrow.dao;

import com.maxon.tomorrow.domain.Client;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Maksym_Kotii
 */
public interface ClientRepository  extends CrudRepository<Client, Long> {

    List<Client> findByName(String name);
}
