package com.chillout.backend.ChillOut.dao;

import com.chillout.backend.ChillOut.model.Etablisment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
public interface EtablismentRepository extends CrudRepository<Etablisment, Long> {

    @Override
    List<Etablisment> findAll();
}
