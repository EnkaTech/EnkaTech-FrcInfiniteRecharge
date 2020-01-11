/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import frc.robot.commands.ShooterManuel;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoShooter extends CommandGroup {
 
public AutoShooter()  {
  
  addSequential(new ShooterManuel(1), 3);
  addSequential(new ShooterManuel(1), 2);
  addParallel(new HazneManuel(0.5));
  }
}
