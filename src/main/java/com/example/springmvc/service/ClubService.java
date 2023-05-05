package com.example.springmvc.service;


import com.example.springmvc.model.ClubModel;
import com.example.springmvc.repository.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubService {

    private ClubRepository repository;

    public ClubService(ClubRepository repository) {
        this.repository = repository;
    }

    public void addClub(ClubModel club) {
        repository.save(club);

    }

    public Optional<ClubModel> getClub(Long id) {
        return repository.findById(id);
    }

    public List<ClubModel> getAllClubs() {
        return repository.findAll();
    }
}
