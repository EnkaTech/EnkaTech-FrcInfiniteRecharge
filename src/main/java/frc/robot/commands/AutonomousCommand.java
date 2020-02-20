/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
  /**
   * Add your docs here.
   */
  public AutonomousCommand() {
    addSequential(new ShooterManuel(1),2);
    addSequential(new HazneManuel(1),3);
    addParallel(new ShooterManuel(1));
    addSequential(new GyroTurn(45));
    addParallel(new GyroDrive(true),2);
    addSequential(new GyroTurn(0));
    addParallel(new GyroDrive(true),2);
    addParallel(new Intake(-1));
    addParallel(new HazneManuel(1),2);
    addSequential(new GyroTurn(45));
    addParallel(new GyroDrive(false),2);
    addSequential(new GyroTurn(0));
    addParallel(new GyroDrive(false),2);
 
  }
}
