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

		_robot.Lift.setPower(y);
	}
}
