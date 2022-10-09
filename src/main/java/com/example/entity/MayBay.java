package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MayBay {
    @Id
    @Column(name="MaMB")
    private String maMB;
    
    @Column(name="Loai")
    private String loai;

    @Column(name="TamBay")
    private int tamBay;
    
    public MayBay() {
    	
    }

	public MayBay(String maMB, String loai, int tamBay) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public String getMaMB() {
		return maMB;
	}

	public void setMaMB(String maMB) {
		this.maMB = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tamBay;
	}

	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}
	
	
    
    
}