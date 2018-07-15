package LECTURE.Lecture7;
//We’re developing the software for a smart light bulb with variable intensity dial 
//(Low/Medium/High) and multiple color settings (Red/Green/Blue/White). 
//We receive the following test code and desired output. 

public class TestLightBulb {
	public static void main(String[] args) {
		LightBulb smartLight = new LightBulb();
		//output initial state
		System.out.println(smartLight.toString());
		
		//turn intensity dial 29 times
		for (int i = 0; i < 29; i++)
			smartLight.adjustDial();
		System.out.println(smartLight.toString());
		
		//turn the lightswitch on or off 9 times
		for (int i = 0; i < 9; i++)
			smartLight.useSwitch();
		System.out.println(smartLight.toString());
		
		//try changing the color
		smartLight.changeColor("Pink");
		smartLight.changeColor("Green");
		System.out.println(smartLight.toString());
	}
}

class LightBulb{
	private String[] intensity = {"Low", "Medium", "High"};
	private int setting = 0;
	private boolean onOff = false;
	private String color = "White";
	
	public LightBulb(){
	}
	
	//dial revolves using modulous
	public void adjustDial() {
		setting = (setting + 1) % 3;
	}
	
	//turning the light on or off reverses the boolean
	public void useSwitch() {
		onOff = !onOff;
	}
	
	//only allow the 4 valid colors
	public void changeColor(String newColor) {
		switch(newColor) {
		case "Red": color = "Red"; break;
		case "Blue": color = "Blue"; break;
		case "Green": color = "Green"; break;
		case "White": color = "White"; break;
		default: System.out.println("Invalid Color: " + newColor + "\n");
		}
	}
	
	public String toString() {
		String returnString = "The Status of the smart bulb is:\n";
		returnString += "Intensity - " + intensity[setting] + "\n";
		returnString += "Color - " + color + "\n";
		if (onOff)
			returnString += "The light is ON.\n";
		else
			returnString += "The light is OFF.\n";
		return returnString;
	}
	
}