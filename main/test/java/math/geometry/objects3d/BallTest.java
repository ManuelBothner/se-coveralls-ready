//### BallTest.java ########################################################################################################################
package math.geometry.objects3d;

//### IMPORTS ##############################################################################################################################
import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BallTest {

//### ATTRIBUTES ###########################################################################################################################

	private Ball ball;
	
//### SETUP METHODS ########################################################################################################################
	
	@Before
	public void setUp() {
		this.ball = new Ball(1000.0);
	}

//### TEST METHODS #########################################################################################################################
	
	@Test
	public void testConstructor() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		//Set the attribute radius to a wrong start value:
		Field radius = this.ball.getClass().getDeclaredField("radius");
		radius.setAccessible(true);
		radius.setDouble(this.ball, 19.74);
		
		this.ball = new Ball(5.234);
		
		//Read out the private attributes that are set through the constructor:
		radius = this.ball.getClass().getDeclaredField("radius");
		radius.setAccessible(true);
		double value = (double) radius.getDouble(this.ball);
		
		Assert.assertEquals("The constructor of the Ball class has a failure", value, 5.234, 0);
		
		this.ball = new Ball(-2.34);
		
		//Read out the private attributes that are set through the constructor:
		radius = this.ball.getClass().getDeclaredField("radius");
		radius.setAccessible(true);
		value = (double) radius.getDouble(this.ball);
		
		Assert.assertEquals("The constructor of the Ball class has a failure", value , 0.0, 0);
	}
	
	@Test
	public void testGetter() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		//Set the attribute radius to a test value:
		Field radius = this.ball.getClass().getDeclaredField("radius");
	    radius.setAccessible(true);
	    radius.setDouble(this.ball, 3.43);
		
	    //Test if the getter method returns the right value:
	    Assert.assertEquals("The getter method for radius has a failure", 3.43, this.ball.getRadius(), 0);
	    
	}
	
	@Test
	public void testSetter() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		//Set the attribute radius to a wrong start value:
		Field radius = this.ball.getClass().getDeclaredField("radius");
	    radius.setAccessible(true);
	    radius.setDouble(this.ball, 19.74);
		
		this.ball.setRadius(9.45);
		
		//Read out the private attributes that are set through the constructor:
		radius = this.ball.getClass().getDeclaredField("radius");
		radius.setAccessible(true);
		double value = (double) radius.getDouble(this.ball);
				
		Assert.assertEquals("The setter method for radius has a failure", 9.45, value, 0);
		
		this.ball.setRadius(-2.0);
		
		//Read out the private attributes that are set through the constructor:
		radius = this.ball.getClass().getDeclaredField("radius");
		radius.setAccessible(true);
		value = (double) radius.getDouble(this.ball);
				
		Assert.assertEquals("The setter method for radius has a failure", 0.0, value, 0);
		
	}
	
	@Test
	public void testGetSurfaceArea() {
		
		this.ball = new Ball(2.0);	
		Assert.assertEquals("The getSurfaceArea method has a failure", 50.265482457424, this.ball.getSurfaceArea(), 0);
		
		this.ball = new Ball(-2.0);
		Assert.assertEquals("The getSurfaceArea method has a failure", 0.0, this.ball.getSurfaceArea(), 0);
	}
	
	@Test
	public void testGetVolume() {
		
		this.ball = new Ball(3.7);	
		Assert.assertEquals("The getVolume method has a failure", 212.17479024299152, this.ball.getVolume(), 0);
		
		this.ball = new Ball(-2.0);
		Assert.assertEquals("The getVolume method has a failure", 0.0, this.ball.getVolume(), 0);
	}
	
	//That test method tests a method of the abstract parent class:
	@Test
	public void testGetSurfaceAreaToVolumeRatio() {
		
		this.ball = new Ball(3.7);	
		Assert.assertEquals("The getSurfaceAreaToVolumeRatio method in the parent class has a failure", 0.8108108108108107, this.ball.getSurfaceAreaToVolumeRatio(), 0);
		
		this.ball = new Ball(-2.0);
		Assert.assertEquals("The getSurfaceAreaToVolumeRatio method in the parent class has a failure", Double.NaN, this.ball.getSurfaceAreaToVolumeRatio(), 0);
	}
	
	@Test
	public void testToString() {
		
		String string = "Object: Ball - Radius: 13.6 - Surface area: 2324.2759088312855 - Volume: 10536.717453368494 - Surface area to volume ratio: 0.22058823529411767";
		
		this.ball.setRadius(13.6);
			
		Assert.assertEquals("The setter method for radius has a failure", string, this.ball.toString());
		
	}

//### TEARDOWN METHODS #####################################################################################################################
	
	@After
	public void tearDown() {
		this.ball = null;
	}
	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################