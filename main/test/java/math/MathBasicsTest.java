//### MathBasicsTest.java ##################################################################################################################
package math;

//### IMPORTS ##############################################################################################################################
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;


public class MathBasicsTest {
		
//### TEST METHODS #########################################################################################################################
	
	/* */
	public void testIfClassIsWellDefined(final Class<?> mathBasics) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Check if class is final:
		Assert.assertTrue("class must be final", Modifier.isFinal(mathBasics.getModifiers()));
		//Check there is only one constructor:
	    Assert.assertEquals("There must be only one constructor", 1, mathBasics.getDeclaredConstructors().length);
	    //Get the declared constructor of the class:
	    final Constructor<?> constructor = mathBasics.getDeclaredConstructor();
	    //Check that Constructor is not accessible and private:
	    if (constructor.isAccessible() || !Modifier.isPrivate(constructor.getModifiers())) {
	        Assert.fail("Constructor is not private");
	    }
	    
	    //The following lines are necessary to get full code coverage:
	    
	    //Set the constructor to accessible:
	    constructor.setAccessible(true);
	    //Should throw no InstantiationException:
	    constructor.newInstance();
	    //Set back to not accessible:
	    constructor.setAccessible(false);
	    
	    //Check if every method of the class is static:
	    for (final Method method : mathBasics.getMethods()) {
	        if (!Modifier.isStatic(method.getModifiers()) && method.getDeclaringClass().equals(mathBasics)) {
	            Assert.fail("there exists a non-static method:" + method);
	        }
	    }
	}

	@Test
	public void testClassDefinition() throws Exception {
	    	
		//Call function that test the class:
		this.testIfClassIsWellDefined(MathBasics.class);	    
	}
	
	@Test
	public void testPi() {
		double pi = MathBasics.PI;
		Assert.assertEquals("The PI constant of the MathBasics class has a failure", 3.141592653589, pi, 0);
	}
	
	@Test
	public void testPow() {
		
		double pow = MathBasics.pow(2.0);
		Assert.assertEquals("The pow(double base) method of the MathBasics class has a failure", 4.0, pow, 0);
		
		pow = MathBasics.pow(2.0, 3);
		Assert.assertEquals("The pow(double base, int exp) method of the MathBasics class has a failure", 8.0, pow, 0);
		
	}
	
	@Test
	public void testSqrt() {
		
		double sqrt = MathBasics.sqrt(4.0);
		Assert.assertEquals("The sqrt(double base) method of the MathBasics class has a failure", 2.0, sqrt, 0);
	}
	
//##########################################################################################################################################
}
//### EOF ##################################################################################################################################