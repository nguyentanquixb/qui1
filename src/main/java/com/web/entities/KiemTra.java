package com.web.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kiemtra")
public class KiemTra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String msv;
	private String diemdanh;
	private int id_hoatdong;
}
