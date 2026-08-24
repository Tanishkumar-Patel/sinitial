package com.example.bap.mapper;

import com.example.bap.dto.pdto;
import com.example.bap.model.pmodel;

public class pmapper {
   public pmodel tomodel(pdto pdto)
   {
       pmodel pmodel=new pmodel();
       pmodel.setName(pdto.getName());
       pmodel.setOpening_balance(pdto.getOpening_balance());
       pmodel.setAddress(pdto.getAddress());
       pmodel.setCategory(pdto.getCategory());
       return pmodel;
   }
   public pdto toDTO(pmodel pmodel)
   {
      pdto pdto=new pdto();
      pdto.setName(pmodel.getName());
      pdto.setOpening_balance(pmodel.getOpening_balance());
      pdto.setAddress(pmodel.getAddress());
      pdto.setCategory(pmodel.getCategory());
      return pdto;
   }
}
