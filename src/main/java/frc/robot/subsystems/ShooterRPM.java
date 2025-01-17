/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ShooterRPMsetter;

/**
 * Add your docs here.
 */
public class ShooterRPM extends PIDSubsystem {
  /**
   * Add your docs here.
   */
  public ShooterRPM() {
    // Intert a subsystem name and PID values here
    super("ShooterRPM", 0.2, 0, 0);
    setAbsoluteTolerance(100);
    setInputRange(0, 6000);
    setOutputRange(-0.5, 0.5);
    // Use these to get going:
    // setSetpoint() - Sets where the PID controller should move the system
    // to
    // enable() - Enables the PID controller.
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ShooterRPMsetter(5500));
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return RobotMap.ShooterEncoder.getRate()*60; 
  }

  @Override
  protected void usePIDOutput(double output) {
    // Use output to drive your system, like a motor
    RobotMap.ShooterMotor1.set(ControlMode.Follower,2);
    RobotMap.ShooterMotor2.set(ControlMode.PercentOutput,1+output);
  } 
}
