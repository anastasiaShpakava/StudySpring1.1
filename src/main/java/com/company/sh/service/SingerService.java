package com.company.sh.service;

import com.company.sh.model.Singer;
import com.company.sh.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class SingerService {
    @Autowired
    SingerRepository singerRepository;

    public SingerService(SingerRepository singerRepository) {
        this.singerRepository=singerRepository;
    }


    public List<Singer> getAllSingers() {
        return  singerRepository.findAll();
    }

    public Singer findSinger(Integer id) {
        return singerRepository.findById(id).orElse(null);
    }

}
