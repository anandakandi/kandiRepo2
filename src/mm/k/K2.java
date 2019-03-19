package mm.k;

import org.testng.annotations.Test;

public class K2 {

	@Test (groups={"anand"})
	public void colorsBlue(){
		System.out.println("given priorty to Blue : ");
	}
	@Test (groups={"kumar"})
	public void colorsYellow(){
		System.out.println("given priorty to Yellow : ");
	}
	@Test (groups={"anand"})
	public void colorsBlack(){
		System.out.println("given priorty to Black : ");
	}
	@Test (groups={"kumar"})
	public void colorsGreen(){
		System.out.println("given priorty to Green : ");
	}
	@Test (groups={"anand"})
	public void colorsWhite(){
		System.out.println("given priorty to White : ");
	}
}
