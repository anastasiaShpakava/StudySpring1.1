package com.company.sh.service;

import com.company.sh.model.Singer;
import com.company.sh.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class SingerService {
    @Autowired
   private SingerRepository singerRepository;

    public List<Singer> getAllSingers() {
        return  singerRepository.findAll();
    }

    public Singer findSinger(Integer id) {
        return singerRepository.findById(id).orElse(null);
    }

}
