//### Main.java ############################################################################################################################
package main;

//### IMPORTS ##############################################################################################################################
import math.geometry.GeoObject3dList;
import math.geometry.objects3d.Ball;
import math.geometry.objects3d.Cone;
import math.geometry.objects3d.Cuboid;


/* Main [class]: Main class of the project: */
public class Main {

//### STATIC METHODS #######################################################################################################################	
	
	/* main [method]: Start point of the application */
	public static void main(String[] args) {
		
		//List that collect objects:
		GeoObject3dList objectList = new GeoObject3dList();
		
		//Create some new objects:
		Ball   ball1   = new Ball(4.0);
		Ball   ball2   = new Ball(3.743);
		Cuboid cuboid1 = new Cuboid(2.0, 1.0, 5.0);
		Cone   cone1   = new Cone(3.0, 5.0);
		Cone   cone2   = new Cone(7.0, 1.32); 
		Cone   cone3   = new Cone(4.444, 4.444); 
		
		//Status messages:
		System.out.println("Created a new Ball: " + ball1.toString());
		System.out.println("Created a new Ball: " + ball2.toString());
		System.out.println("Created a new Cuboid: " + cuboid1.toString());
		System.out.println("Created a new Cone: " + cone1.toString());
		System.out.println("Created a new Cone: " + cone2.toString());
		System.out.println("Created a new Cone: " + cone3.toString());
		
		//Add the objects to the object list:
		objectList.add(ball1);
		objectList.add(ball2);
		objectList.add(cuboid1);
		objectList.add(cone1);
		objectList.add(cone2);
		objectList.add(cone3);
		
		//Print the number of objects in the list:
		System.out.println("No of object in the list: " + objectList.size());
		System.out.println("No of balls in the list: " + objectList.getNoOfBalls());
		System.out.println("No of cuboids in the list: " + objectList.getNoOfCuboid());
		System.out.println("No of cones in the list: " + objectList.getNoOfCones());
		
		//Print the total amount of surface area and volume:
		System.out.println("Surface area of all objects: " + objectList.getTotalSurfaceArea());
		System.out.println("Volume of all objects: " + objectList.getTotalVolume());
		
		
		//Print the element with the maximum surface area, volume and surface area to volume ratio:
		System.out.println("Object with the maximum surface area: " + objectList.getObjectWithMaxSurfaceArea().toString());
		System.out.println("Object with the maximum volume: " + objectList.getObjectWithMaxVolume().toString());
		System.out.println("Object with the maximum surface area to volume ratio: " + 
				objectList.getObjectWithMaxSurfaceAreaToVolumeRatio().toString());
		
	}

//##########################################################################################################################################
}
//### EOF ##################################################################################################################################