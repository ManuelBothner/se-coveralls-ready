package math.geometry;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import math.geometry.objects3d.Ball;
import math.geometry.objects3d.Cone;
import math.geometry.objects3d.Cuboid;
import math.geometry.objects3d.GeometricObject;

//### IMPORTS ##############################################################################################################################
public class GeoObject3dListTest {
	
//### ATTRIBUTES ###########################################################################################################################

	private GeoObject3dList list;
	private Ball ball1;
	private Cone cone1;
	private Cuboid cuboid1;
	
//### SETUP METHODS ########################################################################################################################
		
	@Before
	public void setUp() {
		
		this.list = new GeoObject3dList();
		
		this.ball1 = new Ball(1.0);
		this.cone1 = new Cone(2.0, 5.0);
		this.cuboid1 = new Cuboid(2.0, 2.0, 2.0);
	}
	
//### TEST METHODS #########################################################################################################################

	@Test
	public void testConstructor() {
		
		//Check if all object counter are zero;
	    Assert.assertEquals("The constructor of the GeoObject3dList class has a failure", 0, this.list.size());
	    Assert.assertEquals("The constructor of the GeoObject3dList class has a failure", 0, this.list.getNoOfBalls());
	    Assert.assertEquals("The constructor of the GeoObject3dList class has a failure", 0, this.list.getNoOfCones());
	    Assert.assertEquals("The constructor of the GeoObject3dList class has a failure", 0, this.list.getNoOfCuboid());
	    
	    //Check if the total amount of surface area and volume is zero:
	    Assert.assertEquals("The constructor of the GeoObject3dList class has a failure", 0, this.list.getTotalSurfaceArea(), 0);
	    Assert.assertEquals("The constructor of the GeoObject3dList class has a failure", 0, this.list.getTotalVolume(), 0);
	}
	
	@Test
	public void testAdd() {
		
		this.list.add(this.ball1);
		Assert.assertEquals("The method add() of the GeoObject3dList class has a failure", 1, this.list.size());
	    Assert.assertEquals("The method add() of the GeoObject3dList class has a failure", 1, this.list.getNoOfBalls());
	    this.list.add(this.cone1);
	    Assert.assertEquals("The method add() of the GeoObject3dList class has a failure", 2, this.list.size());
	    Assert.assertEquals("The method add() of the GeoObject3dList class has a failure", 1, this.list.getNoOfCones());
	    this.list.add(this.cuboid1);
	    Assert.assertEquals("The method add() of the GeoObject3dList class has a failure", 3, this.list.size());
	    Assert.assertEquals("The method add() of the GeoObject3dList class has a failure", 1, this.list.getNoOfCuboid());

	}

	@Test
	public void testRemove() {
		
		this.list.add(this.ball1);
	    this.list.add(this.cone1);
	    this.list.add(this.cuboid1);
	    
	    GeometricObject obj = this.list.remove(0);
	    
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", 2, this.list.size());
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", 0, this.list.getNoOfBalls());
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", Ball.class, obj.getClass());
	    
	    obj = this.list.remove(0);
	    
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", 1, this.list.size());
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", 0, this.list.getNoOfCones());
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", Cone.class, obj.getClass());
	    
	    obj = this.list.remove(0);
	    
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", 0, this.list.size());
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", 0, this.list.getNoOfCuboid());
	    Assert.assertEquals("The method remove() of the GeoObject3dList class has a failure", Cuboid.class, obj.getClass());
	}
	
	@Test
	public void testGetObjectWithMaxSurfaceArea() {
		
		this.list.add(this.ball1);
	    this.list.add(this.cone1);
	    this.list.add(this.cuboid1);
	    
	    GeometricObject obj = this.list.getObjectWithMaxSurfaceArea();
	    
	    Assert.assertEquals("The method getObjectWithMaxSurfaceArea() of the GeoObject3dList class has a failure", this.cone1, obj);
	    
	}
	
	@Test
	public void testGetObjectWithMaxVolume() {
		
		this.list.add(this.ball1);
	    this.list.add(this.cone1);
	    this.list.add(this.cuboid1);
	    
	    GeometricObject obj = this.list.getObjectWithMaxVolume();
	    
	    Assert.assertEquals("The method getObjectWithMaxVolume() of the GeoObject3dList class has a failure", this.cone1, obj);
	    
	}
	
	@Test
	public void testGetObjectWithMaxSurfaceAreaToVolumeRatio() {
		
		this.list.add(this.ball1);
	    this.list.add(this.cone1);
	    this.list.add(this.cuboid1);
	    
	    GeometricObject obj = this.list.getObjectWithMaxSurfaceAreaToVolumeRatio();
	    
	    Assert.assertEquals("The method getObjectWithMaxSurfaceAreaToVolumeRatio() of the GeoObject3dList class has a failure",
	    		this.ball1, obj);
	    
	}
	
//### TEARDOWN METHODS #####################################################################################################################	
		
	@After
	public void tearDown() {
		this.list = null;
	}
	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################