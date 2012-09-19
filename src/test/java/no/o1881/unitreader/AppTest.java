package no.o1881.unitreader;

import java.io.FileReader;
import junit.framework.Assert;
import no.o1881.domain.Unit;
import org.junit.Test;

/**
 * Unit test for class UnitName
 */
public class AppTest {
	
	private final static String COMPANY = "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/company.xml";
	private final static String PERSON = "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/person.xml";
	private final static String HYBRID = "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/hybrid.xml";
	
	@Test
	public void testCompanyUnitName() throws Exception {
		UnitName unitname = new UnitName();
		Unit unit = unitname.getUnit(new FileReader(COMPANY));
		Assert.assertEquals("Peppes Pizza", unitname.getName(unit));
		
		/*
		Assert.assertTrue(unit instanceof Company);
		Company companyunit = (Company)unit;
		Assert.assertEquals("Peppes Pizza", companyunit.getCompanyname());
		*/		
	}
	
	@Test
	public void testPersonUnitName() throws Exception {
		UnitName unitname = new UnitName();
		Unit unit = unitname.getUnit(new FileReader(PERSON));
		Assert.assertEquals("Audun Wilhelmsen", unitname.getName(unit));
		
		/*
		Assert.assertTrue(unit instanceof Person);
		Person personunit = (Person)unit;
		Assert.assertEquals("Audun Wilhelmsen", personunit.getFirstname() + " " + personunit.getLastname());
		*/		
	}

	@Test
	public void testHybridUnitName() throws Exception {
		UnitName unitname = new UnitName();
		Unit unit = unitname.getUnit(new FileReader(HYBRID));
		Assert.assertEquals("Magnhild Rølvåg", unitname.getName(unit));
		
		/*
		Assert.assertTrue(unit instanceof Company);
		Company companyunit = (Company)unit;
		Assert.assertNotNull(companyunit.getPerson());
		*/		
	}
	
	@Test
	public void testCompanyType() throws Exception {
		UnitName unitname = new UnitName();
		Unit unit = unitname.getUnit(new FileReader(COMPANY));
		Assert.assertEquals("Company", unitname.getType(unit));		
	}
	
	@Test
	public void testPersonType() throws Exception {
		UnitName unitname = new UnitName();
		Unit unit = unitname.getUnit(new FileReader(PERSON));
		Assert.assertEquals("Person", unitname.getType(unit));
	}
	
	@Test
	public void testHybridType() throws Exception {
		UnitName unitname = new UnitName();
		Unit unit = unitname.getUnit(new FileReader(HYBRID));
		Assert.assertEquals("Hybrid", unitname.getType(unit));		
	}
}
