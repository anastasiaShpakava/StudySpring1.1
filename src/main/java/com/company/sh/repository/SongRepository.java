package com.company.sh.repository;


import com.company.sh.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SongRepository extends JpaRepository <Song, Integer> {
    @Query("select s from Song s where s.singer_id.id = ?")
    List<Song> findBySingerId(Integer id);
}
