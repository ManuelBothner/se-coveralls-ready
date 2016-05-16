//### Cuboid.java ##########################################################################################################################

package math.geometry.objects3d;

/* Cuboid [class]: Class that represents the geometric object cuboid */
public class Cuboid extends GeometricObject {

//### ATTRIBUTES ###########################################################################################################################

	private double height;
	private double width;
	private double depth;
	
//### CONSTRUCTORS #########################################################################################################################

	/* Cuboid [constructor]: Creates a new Cuboid object and initialize it with a height, width and depth */
	public Cuboid(double height, double width, double depth) {
		
		//If height is negativ set it to 0:
		if(height < 0) {
			this.height = 0;
		}
		else {
			this.height = height;
		}
		//If width is negativ set it to 0:
		if(width < 0) {
			this.width = 0;
		}
		else {
			this.width = width;
		}
		//If depth is negativ set it to 0:
		if(depth < 0) {
			this.depth = 0;
		}
		else {
			this.depth = depth;
		}
	
	}
	
//### GETTER/SETTER ########################################################################################################################
	
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

	/* getWidth [method]: Returns the width of the object */
	public double getWidth() {
		return width;
	}

	/* setWidth [method]: Sets a new width */
	public void setWidth(double width) {
		
		//If width is negativ set it to 0:
		if(width < 0) {
			this.width = 0;
		}
		else {
			this.width = width;
		}
	}

	/* getDepth [method]: Returns the depth of the object */
	public double getDepth() {
		
		return depth;
	}

	/* setDepth [method]: Sets a new depth */
	public void setDepth(double depth) {
		
		//If depth is negativ set it to 0:
		if(depth < 0) {
			this.depth = 0;
		}
		else {
			this.depth = depth;
		}
	}
	
//### PUBLIC METHODS #######################################################################################################################
	
	/* getSurfaceArea [method]: Method that returns the surface area of the object */
	@Override
	public double getSurfaceArea() {
		//Surface area = 2 * (a * b + a * c + b * c):
		return 2 * (this.height * this.width + this.height * this.depth + this.width * this.depth);
	}

	/* getVolume [method]: Method that returns the volume of the object */
	@Override
	public double getVolume() {
		//Volume = a * b * c:
		return this.height * this.width * this.depth;
	}

	/* toString [method]: Method that returns information about the current object in a String */
	@Override
	public String toString() {
		return "Object: Cuboid - Height: " + this.height +
			   " - Width: " + this.width +
			   " - Depth: " + this.depth +
			   " - Surface area: " + this.getSurfaceArea() +
			   " - Volume: " + this.getVolume() +
			   " - Surface area to volume ratio: " + this.getSurfaceAreaToVolumeRatio();
	}

	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################