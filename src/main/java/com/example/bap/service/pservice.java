package com.example.bap.service;

import com.example.bap.dto.pdto;
import com.example.bap.mapper.pmapper;
import com.example.bap.model.pmodel;
import com.example.bap.repository.prepository;
import org.springframework.stereotype.Service;

@Service
public class pservice {
    private final prepository prepository;
    private final pmapper pmapper;

    public pservice(prepository prepository) {
        this.prepository = prepository;
        this.pmapper = new pmapper();
    }
    public pdto newCustomer(pdto pdto)
    {
        pmodel customer=prepository.save(pmapper.tomodel(pdto));
        return pmapper.toDTO(customer);
    }
}
