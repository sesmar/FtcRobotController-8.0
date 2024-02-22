package org.firstinspires.ftc.teamcode.Goonies.Common;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Lift {
	DcMotor _liftMotor;
	public Lift(DcMotor liftMotor){
		_liftMotor = liftMotor;

		_liftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
		_liftMotor.setPower(0);
	}

	public void setPower(double power){
		_liftMotor.setPower(power);
	}
}
