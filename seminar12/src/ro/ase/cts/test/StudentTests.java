package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="gigel";
		Student student=new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student=new Student();
		assertNotNull(student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNota() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculMedie() {
		Student student=new Student();
		int nota1=5;
		int nota2=10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		float medie1=student.calculeazaMedie();
		float medie2=(nota1+nota2)/2.0f;
		
		assertEquals(medie2, medie1, 0.001);
	}
	
	@Test
	public void testAreRestante() {
		Student student=new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		//assertEquals(true, student.areRestante());
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		student.adaugaNota(6);
		student.adaugaNota(10);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testSetNume() {
		Student student=new Student();
		String nume="Ioana";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaAruncaExceptie() {
		Student student=new Student();
		student.getNota(-1);
	}
	
	@Test
	public void testJU3GetNotaAruncaExceptie() {
		Student student=new Student();
		try {
			student.getNota(-1);
			fail("Metoda nu arunca nicio exceptie");
		}catch(IndexOutOfBoundsException exception){
			
		}catch(Exception exception) {
			fail("Metoda nu arunca IndexOutOfBoundsException ci alt tip de exceptie");
		}
	}
}
