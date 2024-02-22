package org.firstinspires.ftc.teamcode.Goonies.Common;

import com.qualcomm.robotcore.hardware.DcMotor;

public class OmniWheelDriveTrain {
	DcMotor _leftMotor;
	DcMotor _rightMotor;

	public OmniWheelDriveTrain (DcMotor left, DcMotor right){
		_leftMotor = left;
		_rightMotor = right;

		_leftMotor.setDirection(DcMotor.Direction.REVERSE);
		_rightMotor.setDirection(DcMotor.Direction.FORWARD);

		_leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
		_rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

		setPower(0);
	}

	public void setPower(double power){
		setPower(power, power);
	}

	public void setPower(double leftPower, double rightPower){
		_leftMotor.setPower(leftPower);
		_rightMotor.setPower(rightPower);
	}
}
