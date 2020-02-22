package com.example.SamplePosgre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// エンティティクラス：Shohinテーブルののデータを格納する
// geter, seter を記述
@Entity
@Table(name = "shohinmaster")
public class Shohin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shohin_id;
	private Integer hanbaimoto_id;
	private String shohin_mei;
	private String shohin_tanka;
	
	public Integer getShoshinId() {
		return shohin_id;
	}
	public void setShohinId(Integer id) {
		this.shohin_id = id;
	}
	
	public Integer getHanbaimotoId() {
		return hanbaimoto_id;
	}
	public void setHanbaimotoId(Integer id) {
		this.hanbaimoto_id = id;
	}
	
	public String getShohinMei() {
		return shohin_mei;
	}
	public void setShohinMei(String id) {
		this.shohin_mei = id;
	}

	public String getShohinTanka() {
		return shohin_tanka;
	}
	public void setShohinTanka(String id) {
		this.shohin_tanka = id;
	}
	
}
