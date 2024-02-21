package org.firstinspires.ftc.teamcode.Goonies.Common;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class GooniesRobot implements IRobot{
	DcMotor _leftMotor;
	DcMotor _rightMotor;

	public void Initialize(HardwareMap hardwareMap){
		_leftMotor = hardwareMap.get(DcMotor.class, "lfm");
		_rightMotor = hardwareMap.get(DcMotor.class, "RFM");

		_leftMotor.setDirection(DcMotor.Direction.REVERSE);
		_rightMotor.setDirection(DcMotor.Direction.FORWARD);

		_leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
		_rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

		_leftMotor.setPower(0);
		_rightMotor.setPower(0);
	}
}
