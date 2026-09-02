package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {
    private DcMotor frontLeftMotor, backLeftMotor, frontRightMotor, backRightMotor;

    public void init(HardwareMap hwMap) {
        frontLeftMotor = hwMap.get(DcMotor.class, "front_left_motor");
        backLeftMotor = hwMap.get(DcMotor.class, "back_left_motor");
        frontRightMotor = hwMap.get(DcMotor.class, "front_right_motor");
        backRightMotor = hwMap.get(DcMotor.class, "back_right_motor");

        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
}
