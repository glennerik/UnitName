package no.o1881.unitreader;

import java.io.Reader;

import no.o1881.UnitReader;
import no.o1881.domain.Company;
import no.o1881.domain.Person;
import no.o1881.domain.Unit;

public class UnitName {

	private final UnitReader unitReader;
	
	public UnitName() throws Exception{
		this.unitReader = new UnitReader();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args ) throws Exception {
		
		// moved to AppTest.java
		/*
		UnitReader ur = new UnitReader ( ) ;

		UnitName un = new UnitName ( ) ;
		
		Unit Person_tmp = ur.unmarshal( new FileReader ( "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/person.xml" ) ) ;
		Unit Company_tmp = ur.unmarshal( new FileReader ( "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/company.xml" ) ) ;
		Unit Hybrid_tmp = ur.unmarshal( new FileReader ( "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/hybrid.xml" ) ) ;
		
		System.out.print ( un.getType( Person_tmp ) + " : " ) ;
		System.out.println ( un.getName( Person_tmp ) ) ;
		
		System.out.print ( un.getType( Company_tmp ) + " : " ) ;
		System.out.println ( un.getName( Company_tmp ) ) ;
		
		System.out.print ( un.getType( Hybrid_tmp ) + " : " ) ;
		System.out.println ( un.getName( Hybrid_tmp ) ) ;
		*/		

	}


	/**
	 * Returnerer Person, Company eller Hybrid.
	 * @param unit
	 * @return
	 */
	public String getType(Unit unit) {
			if(unit instanceof Person) {
				return "Person";
			}
			
			if(unit instanceof Company) {
				Company cc = (Company)unit;
				if(cc.getPerson() != null) {
					return "Hybrid";
				}
				return "Company";
			}
			
			return null;
			
			
			// Person pp = (Person) ur ;
			//Company cc = (Company) ur ;
			//Unit pp = ur ;
			//Unit cc = ur ;
			
			/*
			if ( pp.getBirthdate() != null && cc.getCompanyname() != null ) {
				System.out.println ( "print Hybrid" ) ;
				return "Hybrid" ;
			}
			*/
			
			/*
			
			if ( pp.getBirthdate() != null ) {
				System.out.println ( "print Person" ) ;
				return "Person" ;
			}
			*/
			
			/*
			if ( cc.getCompanyname() != null ) {
				System.out.println ( "print Company" ) ;
				return "Company" ;
			}
			*/

			// return null ;
			
			
			/*
			int jj = 1 ;
			while ( ur.getClassifications() != null ) {
				ur.getClassifications().
				System.out.println ( jj ) ;
			}
			*/
			
			// System.out.println ( ur.getClass().getField( "CompanyName" ) ) ;
			// System.out.println ( ur. ) ;
			
			//if ( ur.isHasroles() ) {
				//return "Hybrid" ;
			//}
			
			//return ur.getClass().getSimpleName().toString() ;
			
			/*
			// System.out.println ( ur.getDisplayvalues().getDisplayvalue().get(0)) ;
			// System.out.println ( ur.getLocation().getLatlongcoordinate().getLatitude() ) ;
			String person_or_company = ur.getClass().getSimpleName() ;
			
			System.out.println ( ur.getDisplayvalues().getDisplayvalue().size() + " ffffffffffffffffff" ) ;
			
			if ( person_or_company == "Person" ) {
				return "Person" ;
			}
			
			System.out.println ( person_or_company ) ;
			
			System.out.println ( ur.toString() ) ;
			
			System.out.println ( ur.getClass() ) ;
				*/
			
			// return null;
	}

	public String getName(Unit unit){		
		try {
						
			if ( unit instanceof Person ) {
				Person pp = (Person)unit ;
				return pp.getFirstname() + " " + pp.getLastname() ;
			}
			
			if ( unit instanceof Company ) {
				Company cc = (Company)unit ;
				return cc.getCompanyname() ;
			}
			
			return null ;
			
		} catch ( Exception e ) {
			System.out.print ( "Exception message: " ) ;
			System.out.println ( e.getMessage() ) ;
			return null ;
		}
	}
	

	public Unit getUnit(Reader reader) throws Exception {
		return this.unitReader.unmarshal(reader);		
		/*
		// UnitName un = new UnitName ( ) ;
		
		Unit Person_tmp = ur.unmarshal( new FileReader ( "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/person.xml" ) ) ;
		Unit Company_tmp = ur.unmarshal( new FileReader ( "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/company.xml" ) ) ;
		Unit Hybrid_tmp = ur.unmarshal( new FileReader ( "/home/glenn/git/JavaWebServiceStubs/domain-stubs/src/test/resources/hybrid.xml" ) ) ;
		*/
	}

}