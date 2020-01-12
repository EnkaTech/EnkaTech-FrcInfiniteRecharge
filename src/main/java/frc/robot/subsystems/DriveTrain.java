package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.JoystickDrive;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotMap;


public class DriveTrain extends Subsystem {
  
    public void initDefaultCommand() {
       
    	setDefaultCommand(new JoystickDrive());
    }
    public void drive(double x,double y) {
        RobotMap.driveSystem.tankDrive(x, y);
    } 
    public void drive(Joystick joy,double mult) {
    	drive(joy.getRawAxis(5)*mult,joy.getRawAxis(1)*mult);
    }
	
}

