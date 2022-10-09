package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NhanVien {

    @Id
    @Column(name="MaNV")
    private String maNV;
    
    @Column(name="Ten")
    private String ten;

    @Column(name="Luong")
    private int luong;
    
    public NhanVien() {
    	
    }

	public NhanVien(String maNV, String ten, int luong) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	
    
    
}