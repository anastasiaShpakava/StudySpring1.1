package com.company.sh.service;

import com.company.sh.model.Song;
import com.company.sh.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    public List<Song> getAllSongs() {
        return  songRepository.findAll();
    }

    public Song findSong(Integer id) {
        return songRepository.findById(id).orElse(null);
    }

    public Song  findSongBySingerId(Integer id) {
        return (Song) songRepository.findBySingerId(id);
    }
}
