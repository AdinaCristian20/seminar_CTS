package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import mocks.StudentDummy;
import mocks.StudentFake;
import mocks.StudentStub;

public class TestGrupaWithDUmmy {

	@Test
	public void testAdaugaStudent() {
		StudentDummy student=new StudentDummy();
		Grupa grupa=new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}
	
	@Test
	public void testSetPromovabilitate() {
		IStudent student=new StudentStub();
		Grupa grupa=new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testGrupaWIthFakeRIght() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<7;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<3;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
	}
}
