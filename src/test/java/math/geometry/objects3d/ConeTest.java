package math.geometry.objects3d;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//### IMPORTS ##############################################################################################################################
public class ConeTest {

//### ATTRIBUTES ###########################################################################################################################

	private Cone cone;

//### SETUP METHODS ########################################################################################################################
	
	@Before
	public void setUp() {
		this.cone= new Cone(1000.0, 1000.0);
	}
	
//### TEST METHODS #########################################################################################################################

	@Test
	public void testConstructor() {
		
		this.cone = new Cone(10.0, 20.0);
		Assert.assertEquals("The constructor of the class Cone has a failure", 10.0, this.cone.getRadius(), 0);
		Assert.assertEquals("The constructor of the class Cone has a failure", 20.0, this.cone.getHeight(), 0);
		
		this.cone = new Cone(-3.0, 20.0);
		Assert.assertEquals("The constructor of the class Cone has a failure", 0.0, this.cone.getRadius(), 0);
		Assert.assertEquals("The constructor of the class Cone has a failure", 20.0, this.cone.getHeight(), 0);
		
		this.cone = new Cone(10.0, -6.0);
		Assert.assertEquals("The constructor of the class Cone has a failure", 10.0, this.cone.getRadius(), 0);
		Assert.assertEquals("The constructor of the class Cone has a failure", 0.0, this.cone.getHeight(), 0);
		
	}

	@Test 
	public void testSetter() {
		
		this.cone.setRadius(9.3994);
		Assert.assertEquals("The setRadius of the class Cone has a failure", 9.3994, this.cone.getRadius(), 0);
		this.cone.setRadius(-78.0);
		Assert.assertEquals("The setRadius of the class Cone has a failure", 0, this.cone.getRadius(), 0);
		
		this.cone.setHeight(18.34);
		Assert.assertEquals("The setHeight of the class Cone has a failure", 18.34, this.cone.getHeight(), 0);
		this.cone.setHeight(-2.78);
		Assert.assertEquals("The setHeight of the class Cone has a failure", 0, this.cone.getHeight(), 0);
	}
	
	@Test
	public void testToString() {
		
		this.cone = new Cone(2.343, 7.54);
		String msg = "Object: Cone - Radius: 2.343 - Height: 7.54 - Surface area: 75.36414063095462 - Volume: 43.3455523025446 - " + 
				"Surface area to volume ratio: 1.738682209074779";
		
		Assert.assertEquals("The toString method of the class Cone has a failure", msg, this.cone.toString());
		
	}
	
//### TEARDOWN METHODS #####################################################################################################################	
	
	@After
	public void tearDown() {
		this.cone = null;
	}
	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################