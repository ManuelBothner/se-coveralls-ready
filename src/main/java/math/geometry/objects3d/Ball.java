//### Ball.java ############################################################################################################################

package math.geometry.objects3d;

//### IMPORTS ##############################################################################################################################
import math.MathBasics;

/* Ball [class]: Class that represents the geometric object ball */
public class Ball extends GeometricObject {

//### ATTRIBUTES ###########################################################################################################################
	
	private double radius;

//### CONSTRUCTORS #########################################################################################################################
	
	/* Ball [constructor]: Creates a new Ball object and initialize it with a radius */
	public Ball(double radius) {
		
		//If radius is negativ set it to 0:
		if(radius < 0) {
			this.radius = 0;
		}
		else {
			this.radius = radius;
		}
	}

//### GETTER/SETTER ########################################################################################################################
	
	/* getRadius [method]: Returns the radius of the object */
	public double getRadius() {
		return radius;
	}

	/* setRadius [method]: Sets a new radius */
	public void setRadius(double radius) {
		
		//If radius is negativ set it to 0:
		if(radius < 0) {
			this.radius = 0;
		}
		else {
			this.radius = radius;
		}
		
	}

//### PUBLIC METHODS #######################################################################################################################
	
	/* getSurfaceArea [method]: Method that returns the surface area of the object */
	@Override
	public double getSurfaceArea() {
		//Surface area = 4 * Pi * r^2 :
		return 4 * MathBasics.PI * MathBasics.pow(this.radius);
	}
	
	/* getVolume [method]: Method that returns the volume of the object */
	@Override
	public double getVolume() {
		//Volume = (4 * Pi * r^3) / 3 :
		return ( 4 * MathBasics.PI * Math.pow(this.radius, 3) ) / 3;
	}

	/* toString [method]: Method that returns information about the current object in a String */
	@Override
	public String toString() {
		return "Object: Ball - Radius: " + this.radius +
			   " - Surface area: " + this.getSurfaceArea() +
			   " - Volume: " + this.getVolume() +
			   " - Surface area to volume ratio: " + this.getSurfaceAreaToVolumeRatio();
	}

//##########################################################################################################################################
}
//### EOF ##################################################################################################################################