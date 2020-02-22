package com.example.SamplePosgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SamplePosgre.model.Shohin;

@Repository
public interface ShohinRepository extends JpaRepository<Shohin, Integer>{}
