package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Ultrasonic {

private static final AnalogInput ultrasonic = new AnalogInput(Constants.ultrasonicInputChannel);

public static double getVoltage() {
    double ultrasonicVoltage = ultrasonic.getVoltage();
    return ultrasonicVoltage;
}

public static double getDistance() {
    double distance = getVoltage() * Constants.ultrasonicVoltsToDistance;
    return distance;
}

public static void updateDashboard() {
    SmartDashboard.putNumber("ultrasonicDistance", getDistance());
    SmartDashboard.putNumber("ultrasonicVoltage", getVoltage());
}

}