package com.chillout.backend.ChillOut.service;

import com.chillout.backend.ChillOut.dao.EtablismentRepository;
import com.chillout.backend.ChillOut.model.Etablisment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Service
public class EtablismentService {

    @Autowired
    private EtablismentRepository etablismentRepository;

    public Etablisment getById(Long id) {
        return etablismentRepository.findOne(id);
    }

    public List<Etablisment> getAll() {
        return etablismentRepository.findAll();
    }

    public Long create(Etablisment e) {
        Etablisment etablisment = etablismentRepository.save(e);
        return etablisment.getId();
    }

    public Etablisment update(Etablisment e) {
        Etablisment etablisment = etablismentRepository.save(e);
        return etablisment;
    }

    public void delete(Etablisment etablisment) {
        etablismentRepository.delete(etablisment);
    }
}
