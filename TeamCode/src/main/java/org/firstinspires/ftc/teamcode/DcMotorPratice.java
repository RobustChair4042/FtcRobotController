package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench1;

@TeleOp
public class DcMotorPratice extends OpMode {
    TestBench1 bench = new TestBench1();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (bench.isTouchSensorPressed()) {
            bench.setMotorSpeed(0.5);
        }
        else {
            bench.setMotorSpeed(0.0); // stops the motor
        }
        bench.setMotorSpeed(0.5);
        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}
