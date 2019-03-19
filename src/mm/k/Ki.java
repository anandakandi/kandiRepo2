package mm.k;

import org.testng.annotations.Test;

//import org.junit.Test;

public class Ki {

	@Test (dependsOnMethods = {"bicyclePink" } ) 
	public void bicycleRed(){
		System.out.println("this is Redbicycle method ");
	}
	@Test (dependsOnMethods = {"bicyclePink" } ) 
	public void bicycleBlue(){
		System.out.println("this is Bluebicycle method ");
	}
	@Test
	public void bicyclePink(){
		System.out.println("this is Pinkbicycle method ");
	}
	@Test (dependsOnMethods = {"bicyclePink" } ) 
	public void bicycleGreen(){
		System.out.println("this is Greenbicycle method ");
	}
}
