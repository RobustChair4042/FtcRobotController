package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a; // press = TRUE, depress = FALSE
        double leftY = gamepad1.left_stick_y;
        double motorSpeed = gamepad1.left_stick_y;

        if (aButton) {
            telemetry.addData("A button", "Pressed!");

        }
        else { // Otherwise
            telemetry.addData("A button", "NOT pressed");
        }
        telemetry.addData("A button state", aButton);




        if (leftY < 0) {
            telemetry.addData("Left Stick", "is negative");
        }
        else if (leftY == 0) {
            telemetry.addData("Left stick", "is on standby");
        }
        else {
            telemetry.addData("Left Stick", "is positive");
        }
        telemetry.addData("Left stick value", leftY);



        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick", "is in the Dead Zone");
        }




        if (!aButton) {
            motorSpeed *= 2;
        }
    }
}



/*
AND - &&
OR - ||
NOT - !
 */