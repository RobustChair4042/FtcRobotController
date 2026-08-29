package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {
    private DcMotor motor; //linearSlideMotor0 - more descriptive names.
    private double ticksPerRev; //revolution
    private DigitalChannel touchSensor; // Usually use more descriptive name e.g. touchSensorIntake or touchSensorClaw


    public void init(HardwareMap hwMap) {
        //Touch Sensor
        touchSensor = hwMap.get(DigitalChannel.class, "touch sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        //DC Motor
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setDirection(DcMotorSimple.Direction.REVERSE); // If your motor is put in backwards (Especially for mechanum wheels)
    }

    public void setMotorSpeed(double speed) {
        //This accepts valurd from -1.0 to 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // Normalising ticks to revolutions 2:1 ger ratio - * 2
    }

    //--------------------------------------Touch Sensor----------------------------------------------------------

    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }
//-------------------------------------------Exercises-----------------------------------------------------------

    public void setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior zeroBehaviour) {
        motor.setZeroPowerBehavior(zeroBehaviour);
    }


}
