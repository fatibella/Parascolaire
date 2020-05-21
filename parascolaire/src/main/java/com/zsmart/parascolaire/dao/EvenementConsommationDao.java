package com.zsmart.parascolaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.EvenementConsommation;

@Repository
public interface EvenementConsommationDao extends JpaRepository<EvenementConsommation, Long> {

}
