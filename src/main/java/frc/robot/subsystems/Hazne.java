/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.commands.HazneManuel;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
/**
 * An example subsystem. You can replace with me with your own subsystem.
 */
public class Hazne extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  @Override
  protected void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new HazneManuel());
  }
  public void move(double x){
    RobotMap.HazneMotor1.set(x);
    RobotMap.HazneMotor2.set(x);
  }
}
