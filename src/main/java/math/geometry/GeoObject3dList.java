//### GeoObject3dList.java #################################################################################################################

package math.geometry;

//### IMPORTS ##############################################################################################################################
import java.util.LinkedList;
import java.util.ListIterator;

import math.geometry.objects3d.Ball;
import math.geometry.objects3d.Cone;
import math.geometry.objects3d.Cuboid;
import math.geometry.objects3d.GeometricObject;

/* GeoObject3dList [class]: Class that represent a list for geometric objects */
public class GeoObject3dList extends LinkedList<GeometricObject>{

//### CONSTANTS ############################################################################################################################

	private static final long serialVersionUID = 3442339230975063974L;
	
//### ATTRIBUTES ############################################################################################################################
	
	//Attributes that save the number of concrete geometric objects:
	private int noOfBalls;
	private int noOfCones;
	private int noOfCuboid;
	
	//Attributes to save the total amount of surface area and volume:
	private double totalSurfaceArea;
	private double totalVolume;
	
//### CONSTRUCTORS #########################################################################################################################
	
	/* GeoObject3dList [constructor]: Constructor that creates a new GeoObject3dList object */
	public GeoObject3dList() {
		
		this.noOfBalls = 0;
		this.noOfCones = 0;
		this.noOfCuboid = 0;
		this.totalSurfaceArea = 0.0;
		this.totalVolume = 0.0;
		
	}
	
//### GETTER ###############################################################################################################################
	
	/* getNoOfBalls [method]: Returns the number of Ball objects in the list */
	public int getNoOfBalls() {
		return noOfBalls;
	}

	/* getNoOfCones [method]: Returns the number of Cones objects in the list */
	public int getNoOfCones() {
		return noOfCones;
	}

	/* getNoOfCuboid [method]: Returns the number of Cuboid objects in the list */
	public int getNoOfCuboid() {
		return noOfCuboid;
	}

	/* getTotalSurfaceArea [method]: That returns the total surface area of all objects in the list */
	public double getTotalSurfaceArea() {
		return totalSurfaceArea;
	}

	/* getTotalVolume [method]: That returns the total volume of all objects in the list */
	public double getTotalVolume() {
		return totalVolume;
	}
	
//### PUBLIC METHODS #######################################################################################################################
	
	/* add [method]: Method to add a new geometric object to the list */
	@Override
	public boolean add(GeometricObject obj) {
		
		//Read out the class of the geometric object:
		Class<? extends GeometricObject> clazz = obj.getClass();
		
		//If object is a Ball:
		if(clazz == Ball.class) {
			this.noOfBalls++;
		}
		//If object is a Cone:
		else if(clazz == Cone.class) {
			this.noOfCones++;
		}
		//If object is a Cuboid:
		else if(clazz == Cuboid.class) {
			this.noOfCuboid++;
		}
		
		//Add the surface area and the volume of the object to the sums:
		this.totalSurfaceArea += obj.getSurfaceArea();
		this.totalVolume += obj.getVolume();
		
		//Add the object to the list:
		return super.add(obj);
	}
	
	/* remove [method]: Method to remove a the geometric object at a specific position from the list */
	@Override
	public GeometricObject remove(int index) {
		
		//Remove the object:
		GeometricObject obj = super.remove(index);
		
		//Read out the class of the geometric object:
		Class<? extends GeometricObject> clazz = obj.getClass();
		
		//If object is a Ball:
		if(clazz == Ball.class) {
			this.noOfBalls--;
		}
		//If object is a Cone:
		else if(clazz == Cone.class) {
			this.noOfCones--;
		}
		//If object is a Cuboid:
		else if(clazz == Cuboid.class) {
			this.noOfCuboid--;
		}
		
		//Subtract the surface area and the volume of the object:
		this.totalSurfaceArea -= obj.getSurfaceArea();
		this.totalVolume -= obj.getVolume();
		
		return obj;
	}
	
	/* getObjectWithMaxSurfaceArea [method]: Returns the object with the maximum surface area */
	public GeometricObject getObjectWithMaxSurfaceArea() {
		
		double maxSurfaceArea = 0;
		GeometricObject obj = null;
		
		ListIterator<GeometricObject> listIterator = this.listIterator();
        while (listIterator.hasNext()) {
        	
        	GeometricObject curObj = listIterator.next();
        	if(curObj.getSurfaceArea() > maxSurfaceArea) {
        		obj = curObj;
        		maxSurfaceArea = curObj.getSurfaceArea();
        	}
        }
        
        return obj;
		
	}
	
	/* getObjectWithMaxVolume [method]: Returns the object with the maximum volume */
	public GeometricObject getObjectWithMaxVolume() {
		
		double maxVolume = 0;
		GeometricObject obj = null;
		
		ListIterator<GeometricObject> listIterator = this.listIterator();
        while (listIterator.hasNext()) {
        	GeometricObject curObj = listIterator.next();
        	if(curObj.getVolume() > maxVolume) {
        		maxVolume = curObj.getVolume();
        		obj = curObj;
        	}
        }
        
        return obj;
	}
	
	/* getObjectWithMaxSurfaceAreaToVolumeRatio [method]: Returns the object with the maximum surface area to volume ratio */
	public GeometricObject getObjectWithMaxSurfaceAreaToVolumeRatio() {
		
		double maxSurfaceAreaToVolumeRatio = 0;
		GeometricObject obj = null;
		
		ListIterator<GeometricObject> listIterator = this.listIterator();
        while (listIterator.hasNext()) {
        	GeometricObject curObj = listIterator.next();
           if(curObj.getSurfaceAreaToVolumeRatio() > maxSurfaceAreaToVolumeRatio) {
        	   maxSurfaceAreaToVolumeRatio = curObj.getSurfaceAreaToVolumeRatio();
        	  obj = curObj;
           }
        }
        
        return obj;
	}

//##########################################################################################################################################
}
//### EOF ##################################################################################################################################