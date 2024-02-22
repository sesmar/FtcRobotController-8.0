package org.firstinspires.ftc.teamcode.Goonies.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Goonies.Common.GooniesRobot;

public class GamePad1 implements IGamePad{

	Gamepad _gamePad;
	GooniesRobot _robot;

	public GamePad1(GooniesRobot robot, Gamepad gamePad){
		_robot = robot;
		_gamePad = gamePad;
	}

	@Override
	public void HandleInput() {
		double spin = _gamePad.right_stick_x;
		double y = _gamePad.left_stick_y;

		int reduction = 3;
		if (_gamePad.right_bumper){reduction = 1;}

		if (Math.abs(spin) > 0.1){
			_robot.DriveTrain.setPower(spin/reduction, -(spin/reduction));
		} else {
			_robot.DriveTrain.setPower(-(y/reduction));
		}
	}
}
