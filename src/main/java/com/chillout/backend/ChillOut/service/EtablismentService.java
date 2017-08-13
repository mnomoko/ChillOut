package com.chillout.backend.ChillOut.service;

import com.chillout.backend.ChillOut.dao.EtablismentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Service
public class EtablismentService {

    @Autowired
    private EtablismentRepository etablismentRepository;
}
