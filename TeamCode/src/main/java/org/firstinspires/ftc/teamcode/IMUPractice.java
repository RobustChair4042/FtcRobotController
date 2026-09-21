package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchIMU;

@TeleOp
public class IMUPractice extends OpMode {
    double heading;
    TestBenchIMU bench = new TestBenchIMU();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {
        heading = bench.getHeading(AngleUnit.DEGREES);
        if (heading < 0.5 && heading > -0.5) {
            bench.setMotor(0);
        }
        else if (heading > 0.5) {
            bench.setMotor(0.5);
        }
        else {
            bench.setMotor(-0.5);
        }
        telemetry.addData("Heading", bench.getHeading(AngleUnit.RADIANS));



    }
}
