//### GeometricObject.java #################################################################################################################

package math.geometry.objects3d;

/* GeometricObject [class]: Class that serve as template for concrete geometric objects */
public abstract class GeometricObject {
	
//### ABSTRACT METHODS #####################################################################################################################
	
	/* getSurfaceArea [method]: Method that returns the surface area of the concrete object */
	public abstract double getSurfaceArea();
	
	/* getVolume [method]: Method that returns the volume of the concrete object */
	public abstract double getVolume();
	
	/* toString [method]: Method that returns information about the current object in a String */
	public abstract String toString();

//### CONCRETE METHODS #####################################################################################################################
	
	/* getSurfaceAreaToVolumeRation [method]: Method that returns the surface area to volume ratio of the concrete object */
	public double getSurfaceAreaToVolumeRatio() {
		return this.getSurfaceArea() / this.getVolume();
	}
	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################