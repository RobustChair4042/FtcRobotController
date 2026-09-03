package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColour {

    NormalizedColorSensor colourSensor;


    public enum detectedColour {
        RED,
        BLUE,
        YELLOW,
        UNKNOWN


    }

    public void init(HardwareMap hwMap) {
        colourSensor = hwMap.get(NormalizedColorSensor.class, "sensor_colour_distance");
        colourSensor.setGain(8);
    }

    public detectedColour getDetectedColour(Telemetry telemetry) {
        NormalizedRGBA colours = colourSensor.getNormalizedColors(); // Return 4 values

        float normRed, normGreen, normBlue;
        normRed = colours.red / colours.alpha;
        normGreen = colours.green / colours.alpha;
        normBlue = colours.blue / colours.alpha;


        telemetry.addData("Red", normRed);
        telemetry.addData("Green", normGreen);
        telemetry.addData("Blue", normBlue);

        // TODO add if statements for specific colours added


        if (normRed > 0.35 && normGreen < 0.3 && normBlue < 0.3) {
            return detectedColour.RED;
        }

        return detectedColour.UNKNOWN;
    }
}
