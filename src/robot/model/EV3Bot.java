package robot.model;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;
import robot.controller.BotController;

public class EV3Bot
{
private String botMessage;
private int xPosition;
private int yPosition;
private long waitTime;

public EV3Bot()
{

	this.botMessage = "";
	this.xPosition = 50;
	this.yPosition = 50;
	this.waitTime = 4000;
	
	displayMessage();
}

	public void driveRoom()
	{
		//call private helper method here
		displayMessage("driveRoom");
	}

	private void displayMessage()
	{
		LCD.drawString(botMessage, xPosition, yPosition);
		Delay.msDelay(waitTime);
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
