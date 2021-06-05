package mocks;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent{
	private String valoareGetNume;
	private List<Integer> valoareGetNote;
	private float valoareMedie;
	private int valoareGetNota;
	private boolean valoareAreRestante;
	
	
	
	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetNote(List<Integer> valoareGetNote) {
		this.valoareGetNote = valoareGetNote;
	}

	public void setValoareMedie(float valoareMedie) {
		this.valoareMedie = valoareMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return valoareGetNote;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valoareMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestante;
	}

}
