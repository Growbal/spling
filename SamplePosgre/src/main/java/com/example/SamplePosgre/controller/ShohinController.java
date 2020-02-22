package com.example.SamplePosgre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SamplePosgre.model.Shohin;
import com.example.SamplePosgre.service.ShohinService;

@RestController
@RequestMapping(value = "/shohin")
public class ShohinController {
	@Autowired
	private ShohinService shohinService;
	
	// http://localhost:8080/shohin/All にGETでアクセスされたリクエストを処理する
	// 全検索
	@RequestMapping(value = "/All", method=RequestMethod.GET)
	public List<Shohin> index_all(){
		return shohinService.findAllShohinData();
	}

	// １つを検索(未実装)
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public List<Shohin> index_one(){
		return shohinService.findAllShohinData();
	}

}
