package com.example.springmvc.repository;

import com.example.springmvc.model.ClubModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClubRepository extends JpaRepository<ClubModel, Long> {
}
