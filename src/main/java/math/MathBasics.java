//### MathBasics.java ######################################################################################################################

package math;

/* MathBasics [class]: Class that provides basic mathematical functionalities */
public final class MathBasics {
	
//### CONSTANTS ############################################################################################################################
	
	//Circle constant Pi
	public static final double PI = 3.141592653589;
	
//### CONSTRUCTORS #########################################################################################################################

	/* MathBasics [constructor]: Private constructor, it's not intended that objects of this class are created*/
	private MathBasics() {}
	
//### STATIC PUBLIC METHODS ################################################################################################################
	
	/* pow [method]: Method that returns the power of a double value */
	public static double pow(double base) {
		return base * base;
	}

	/* pow [method]: Method that returns the value of the first argument raised to the power of the second argument */
	public static double pow(double base, int exp) {
		
		double pow = 1;
		
		//Calculate base^exp:
		for(int i = 1; i <= Math.abs(exp); i++) {
			pow *= base;
		}
		
		//If the exponent is negative:
		if(exp < 0) {
			return 1/pow;
		}
		//If the exponent is zero:
		else if (exp == 0) {
			return 1;
		}
		//If the exponent is positive:
		else {
			return pow;
		}
		
	}
	
	/* sqrt [method]: Method that returns the positive square root of a double value */
	public static double sqrt(double number) {
		return Math.sqrt(number);
	}
	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################