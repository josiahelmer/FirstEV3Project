package robot.model;

import lejos.hardware.lcd.LCD;
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
}

public void driveRoom()
{
	//call private helper method here
}

private void displayMessage()
{

	
	//overload the displayyMessage method with a single String parameter
	
	//write your first drive method here
	//call the displayMessage("describe action as a string") in the helper method
	
	LCD.drawString(botMessage, xPosition, yPosition);
	Delay.msDelay(waitTime);
	}
	
public void forward()
{
	Motor.A.forward();
	Motor.B.forward();
	Motor.A.Speed(720);// 2 RPM
	Motor.B.Speed(720);// 2 RPM
}


}
