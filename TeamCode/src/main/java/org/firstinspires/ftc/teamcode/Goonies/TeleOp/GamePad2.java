package org.firstinspires.ftc.teamcode.Goonies.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Goonies.Common.GooniesRobot;

public class GamePad2  implements IGamePad{
	GooniesRobot _robot;
	Gamepad _gamePad;

	public GamePad2 (GooniesRobot robot, Gamepad gamePad){
		_robot = robot;
		_gamePad = gamePad;
	}

	@Override
	public void HandleInput(){
		double y = _gamePad.left_stick_y;
		int reduction = 3;

		if (_gamePad.right_bumper){reduction = 1;}

		_robot.Lift.setPower(y/reduction);
	}
}
