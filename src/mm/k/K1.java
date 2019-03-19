package mm.k;

import org.testng.annotations.Test;

public class K1 {

	@Test ( priority = 3)
	public void colorsBlue(){
		System.out.println("given priorty to Blue : ");
	}
	@Test ( priority = 2)
	public void colorsYellow(){
		System.out.println("given priorty to Yellow : ");
	}
	@Test ( priority = 4)
	public void colorsBlack(){
		System.out.println("given priorty to Black : ");
	}
	@Test (enabled= false,  priority = 5)
	public void colorsGreen(){
		System.out.println("given priorty to Green : ");
	}
	@Test ( priority = 1)
	public void colorsWhite(){
		System.out.println("given priorty to White : ");
	}
}
