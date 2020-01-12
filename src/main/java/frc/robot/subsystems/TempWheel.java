/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;



public class TempWheel extends Subsystem {
  
  private static DoubleSolenoid localsolenoid = RobotMap.WheelSolenoid;
  private static SpeedController localmotor = RobotMap.LuckyWheel;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
     //solenoid
  public void Bringdown () {
    localsolenoid.set(Value.kForward);
  }

  public void lift () {
    localsolenoid.set(Value.kReverse);
  }

    //Wheel motor
     public void turn(double x) {
    localmotor.set(x);
  }


}
