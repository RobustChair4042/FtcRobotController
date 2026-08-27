package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //Runs roughly 50x* a second
        double speedForward = -gamepad1.left_stick_y;
        double xDiffJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("xl", gamepad1.left_stick_x);
        telemetry.addData("yl", speedForward);
        telemetry.addData("xr", gamepad1.right_stick_x);
        telemetry.addData("yr", gamepad1.right_stick_y);
        telemetry.addData("x difference for joysticks", xDiffJoysticks);
        telemetry.addData("Sum of l and r triggers", sumTriggers);

        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);



    }
}
