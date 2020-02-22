package com.example.SamplePosgre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SamplePosgre.model.Shohin;
import com.example.SamplePosgre.repository.ShohinRepository;

@Service
@Transactional
public class ShohinService {
	@Autowired
	ShohinRepository shohinRepository;

	// レコード全権取得
	public List<Shohin> findAllShohinData(){
		return shohinRepository.findAll();
	}

	
}
