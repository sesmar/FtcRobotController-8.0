package org.firstinspires.ftc.teamcode.Goonies.Common;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RedTeamRobot implements IRobot {
    DcMotor _leftmotor;
    DcMotor _rightmotor;

    public void Initialize(HardwareMap hardwareMap) {
        _leftmotor = hardwareMap.get(DcMotor.class, "lfm");
        _rightmotor = hardwareMap.get(DcMotor.class, "RFM");

        _leftmotor.setDirection(DcMotor.Direction.REVERSE);
        _rightmotor.setDirection(DcMotor.Direction.FORWARD);

        _leftmotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        _rightmotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        _leftmotor.setPower(0);
        _rightmotor.setPower(0);
    }
}