package com.example.bap.repository;

import com.example.bap.model.pmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface prepository extends JpaRepository<pmodel,Long> {

}
