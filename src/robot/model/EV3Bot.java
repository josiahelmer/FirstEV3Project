package robot.model;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;
import robot.controller.BotController;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class EV3Bot
{
private String botMessage;
private int xPosition;
private int yPosition;
private long waitTime;

private MovePilot botPilot;
private EV3UltrasonicSensor distanceSensor;

public EV3Bot()
{

	this.botMessage = "";
	this.xPosition = 50;
	this.yPosition = 50;
	this.waitTime = 4000;
	
	
	distanceSensor = new EV3UltrasonicSensor(LocalEV3.get().getPort("S1"));
	setupPilot();
	displayMessage();
}

	private void setupPilot()
	{
//	Wheel wheel1 = DifferentialChassis.modelWheel(Motro.A, 43.2).offset(-72);

		Wheel leftWheel = WheeledChassis.modelWheel(Motor.A, 43.2).offset(-72);
		Wheel rightWheel = WheeledChassis.modelWheel(Motor.B, 43.2).offset(72);
		Chassis baseChassis = new WheeledChassis(new Wheel []{leftWheel, rightWheel}, WheeledChassis.TYPE_DIFFERENTIAL);
		botPilot = new MovePilot(baseChassis);
	}

	public void driveRoom()
	{
		if(distanceSensor.getDistanceMode().[0] < 2)
		{
			
		}
		else
		{
			
		}
		
		//call private helper method here
		displayMessage("driveRoom");
		botPilot.travel(254.12);
	}

	private void displayMessage()
	{
		LCD.drawString(botMessage, xPosition, yPosition);
		Delay.msDelay(waitTime);
		LCD.clear();
	}

//overload the displayyMessage method with a single String parameter
	private void displayMessage(String mesage)
	{
		LCD.drawString(botMessage,  xPosition,  yPosition);
		Delay.msDelay(waitTime);
	}

//write your first drive method here
//call the displayMessage("describe action as a string") in the helper method
	
	public void forward()
	{
	Motor.A.forward();
	Motor.B.forward();
	Motor.A.setSpeed(720);// 2 RPM
	Motor.B.setSpeed(720);// 2 RPM
	}


}
