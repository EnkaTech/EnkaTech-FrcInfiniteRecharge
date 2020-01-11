/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class HazneOtonom extends PIDSubsystem {
  private Encoder localencoder = RobotMap.HazneEncoder;
  private SpeedController localmotor0 = RobotMap.HazneMotor1;
  private SpeedController localmotor1 = RobotMap.HazneMotor2;
  public HazneOtonom() {
    // Intert a subsystem name and PID values here
    super("Hazne", 0.25, 0, 0.25);
    setAbsoluteTolerance(1);
    setInputRange(-18, 18);
    setOutputRange(0, 1);
        
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return localencoder.getDistance();
  }

  @Override
  protected void usePIDOutput(double output) {
    // Use output to drive your system, like a motor
    // e.g. yourMotor.set(output);
    localmotor0.set(output);
    localmotor1.set(output);
  }
}
