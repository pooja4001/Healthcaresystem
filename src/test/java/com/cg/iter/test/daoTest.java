package com.cg.iter.test;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.dao.HealthCareDaoImpl;
import com.capgemini.dto.Appointment;
import com.capgemini.dto.DiagnosticCenter;


@SuppressWarnings("unused")
public class daoTest {
	private static HealthCareDaoImpl test;

	DiagnosticCenter center;
	Test test1;
	//BigInteger bint = 23413535;
	BigInteger t3 = new BigInteger("2");
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test = new HealthCareDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAddCenter() {
		boolean result = test.addCenter(new DiagnosticCenter("123", "test"));
		assertTrue(result);
	}
	@Test
	public void testRemoveCenter() {
		boolean result = test.removeCenter(new DiagnosticCenter("123", "test"));
		assertTrue(result);
	}
	@Test
	public void testAddTest(){
		boolean result = test.addTest(new DiagnosticCenter("123A", "AABB"), null) != null;
		assertTrue(result);
	}
	@Test
	public void testRemoveTest(){
		boolean result = test.addTest(new DiagnosticCenter("124A", "AAcc"), null) != null;
		assertTrue(result);
	}
	@Test
	public void testMakeAppointment() {
		boolean result = test.makeAppointment(t3, center, (com.capgemini.dto.Test) test1, "12/12/2025", true);
		assertTrue(result);
	}
//	@Test
//	public void testgetCenterObjectOfcenterId() {
//		DiagnosticCenter result = test.getCenterObjectOfcenterId("test");
//		assertTrue(result);
//	}

//	@Test
//	public void addAppointmentCenter() {
//	
//		boolean approved = true;
//		DiagnosticCenter centerid = new DiagnosticCenter("1234", "1234");
//		Test testid = new Test("123","test");
//		boolean result = test.addAppointment(new Appointment(1235, centerid, 1234, "10/2/22", approved));
//		assertTrue(result);
//	}

}
