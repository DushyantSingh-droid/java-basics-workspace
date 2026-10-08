package com.kodewala.control.flow2;

public class TrafficSignal {
	public void checkSignal(String signal) {
	// -----------SwitchCase To check signal status -------------	
		switch (signal) {
		case "Red" : 
			System.out.println("Stop");
			break;
		case "Yellow" : 
			System.out.println("wait");
			break;
		case "Green" : 
			System.out.println("go");
			break;
		default :
			System.out.println("Invalid Input");
		    break;
		}
		
	}
	public static void main (String args[])
	{
	//------------Passing command line argument ----------------
		TrafficSignal trafficSignal = new TrafficSignal();
		String colour = args [0];
		trafficSignal.checkSignal(colour);
		
	// -----------Hard coded without input------------ 
	//	trafficSignal.checkSignal("Red");
	//	trafficSignal.checkSignal("Yellow");
	//	trafficSignal.checkSignal("Green");
		}
}
