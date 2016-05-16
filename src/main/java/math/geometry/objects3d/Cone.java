//### Cone.java ############################################################################################################################

package math.geometry.objects3d;

//### IMPORTS ##############################################################################################################################
import math.MathBasics;

/* Cone [class]: Class that represents the geometric object cone */
public class Cone extends GeometricObject {

//### ATTRIBUTES ###########################################################################################################################

	private double radius;
	private double height;

//### CONSTRUCTORS #########################################################################################################################
	
	/* Cone [constructor]: Creates a new Cone object and initialize it with a radius and a height */
	public Cone(double radius, double height) {
		
		//If radius is negativ set it to 0:
		if(radius < 0) {
			this.radius = 0;
		}
		else {
			this.radius = radius;
		}
		
		//If height is negativ set it to 0:
		if(height < 0) {
			this.height = 0;
		}
		else {
			this.height = height;
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

	/* getHeight [method]: Returns the height of the object */
	public double getHeight() {
		return height;
	}

	/* setHeight [method]: Sets a new height */
	public void setHeight(double height) {
		
		//If height is negativ set it to 0:
		if(height < 0) {
			this.height = 0;
		}
		else {
			this.height = height;
		}
	}
	
//### PUBLIC METHODS #######################################################################################################################
	
	/* getSurfaceArea [method]: Method that returns the surface area of the object */
	@Override
	public double getSurfaceArea() {
		
		//Calculate the sideline of the cone:
		double sideline = MathBasics.sqrt(MathBasics.pow(this.radius) + MathBasics.pow(this.height));
		//Surface area = Pi * r^2 + Pi * r * s:
		return MathBasics.PI * MathBasics.pow(this.radius) + MathBasics.PI * this.radius * sideline;
	}

	/* getVolume [method]: Method that returns the volume of the object */
	@Override
	public double getVolume() {
		//Volume = 1/3 * r^2 * Pi * h:
		return (1.0/3.0) * MathBasics.pow(this.radius) * MathBasics.PI * this.height;
	}

	/* toString [method]: Method that returns information about the current object in a String */
	@Override
	public String toString() {
		return "Object: Cone - Radius: " + this.radius +
			   " - Height: " + this.height +
			   " - Surface area: " + this.getSurfaceArea() +
			   " - Volume: " + this.getVolume() +
			   " - Surface area to volume ratio: " + this.getSurfaceAreaToVolumeRatio();
	}

//##########################################################################################################################################
}
//### EOF ##################################################################################################################################