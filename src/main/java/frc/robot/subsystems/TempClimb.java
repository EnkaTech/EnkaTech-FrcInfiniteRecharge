/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ClimbManuel;

/**
 * Add your docs here.
 */
public class TempClimb extends Subsystem {
  private static SpeedController localclimb1 = RobotMap.Climb1;
  private static SpeedController localclimb2 = RobotMap.Climb2;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ClimbManuel(0.2));
  }
 public void climb (double power){
  localclimb1.set(power);
  localclimb2.set(-power);
}
}

