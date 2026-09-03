package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchColour;

@TeleOp
public class ColourSensorTest extends OpMode {
    TestBenchColour bench = new TestBenchColour();


    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {
        bench.getDetectedColour(telemetry);

    }
}
