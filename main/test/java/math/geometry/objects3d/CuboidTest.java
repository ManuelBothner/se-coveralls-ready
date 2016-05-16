package math.geometry.objects3d;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//### IMPORTS ##############################################################################################################################
public class CuboidTest {

	private Cuboid cuboid;

//### SETUP METHODS ########################################################################################################################
		
		@Before
		public void setUp() {
			this.cuboid= new Cuboid(1000.0, 1000.0, 1000.0);
		}
		
//### TEST METHODS #########################################################################################################################

		@Test
		public void testConstructor() {
			
			this.cuboid = new Cuboid(10.0, 20.0, 5.0);
			Assert.assertEquals("The constructor of the class Cuboid has a failure", 10.0, this.cuboid.getHeight(), 0);
			Assert.assertEquals("The constructor of the class Cuboid has a failure", 20.0, this.cuboid.getWidth(), 0);
			Assert.assertEquals("The constructor of the class Cuboid has a failure", 5.0, this.cuboid.getDepth(), 0);
			
			this.cuboid = new Cuboid(-3.0, 20.0, 5.0);
			Assert.assertEquals("The constructor of the class Cuboid has a failure", 0.0, this.cuboid.getHeight(), 0);
			
			this.cuboid = new Cuboid(10.0, -6.0, 5.0);
			Assert.assertEquals("The constructor of the class Cuboid has a failure", 0.0, this.cuboid.getWidth(), 0);
			
			this.cuboid = new Cuboid(10.0, 20.0, -2.0);
			Assert.assertEquals("The constructor of the class Cuboid has a failure", 0.0, this.cuboid.getDepth(), 0);
		}

		@Test 
		public void testSetter() {
			
			this.cuboid.setWidth(9.3994);
			Assert.assertEquals("The setRadius of the class Cuboid has a failure", 9.3994, this.cuboid.getWidth(), 0);
			this.cuboid.setWidth(-78.0);
			Assert.assertEquals("The setRadius of the class Cuboid has a failure", 0, this.cuboid.getWidth(), 0);
			
			this.cuboid.setHeight(18.34);
			Assert.assertEquals("The setHeight of the class Cuboid has a failure", 18.34, this.cuboid.getHeight(), 0);
			this.cuboid.setHeight(-2.78);
			Assert.assertEquals("The setHeight of the class Cuboid has a failure", 0, this.cuboid.getHeight(), 0);
			
			this.cuboid.setDepth(18.34);
			Assert.assertEquals("The setHeight of the class Cuboid has a failure", 18.34, this.cuboid.getDepth(), 0);
			this.cuboid.setDepth(-2.78);
			Assert.assertEquals("The setHeight of the class Cuboid has a failure", 0, this.cuboid.getDepth(), 0);
		}
		
		@Test
		public void testToString() {
			
			this.cuboid = new Cuboid(2.343, 7.54, 5.67);
			String msg = "Object: Cuboid - Height: 2.343 - Width: 7.54 - Depth: 5.67 - Surface area: 147.40566 - Volume: 100.16746739999999" + 
					" - Surface area to volume ratio: 1.4715921628662443";
			
			Assert.assertEquals("The toString method of the class Cone has a failure", msg, this.cuboid.toString());
			
		}
		
//### TEARDOWN METHODS #####################################################################################################################	
		
		@After
		public void tearDown() {
			this.cuboid = null;
		}
			
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################