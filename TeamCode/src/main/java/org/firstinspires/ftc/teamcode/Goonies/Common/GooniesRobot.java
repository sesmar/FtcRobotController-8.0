package org.firstinspires.ftc.teamcode.Goonies.Common;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class GooniesRobot implements IRobot{
	public OmniWheelDriveTrain DriveTrain;
	public Lift Lift;

	public void Initialize(HardwareMap hardwareMap){
		DcMotor leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
		DcMotor rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
		DriveTrain = new OmniWheelDriveTrain(leftMotor, rightMotor);

		DcMotor lift = hardwareMap.get(DcMotor.class, "lift");
		Lift = new Lift(lift);
	}
}
