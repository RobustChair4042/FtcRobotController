package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 22593;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        int motorAngle = 164;
        String coachName = "Mr Rhee + Mr Munube";
        String teamName = "Drakon";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Coaches Name", coachName);
        telemetry.addData("Team Name", teamName);
    }

    @Override
    public void loop() {


    }
}