package com.mnu.exam03;
public class Student {
	int bun;
	String name;
	int kor,eng,mat;
	
	public Student() {}
	public Student(int b, String n,int k, int e, int m) {
		bun = b;
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
}
