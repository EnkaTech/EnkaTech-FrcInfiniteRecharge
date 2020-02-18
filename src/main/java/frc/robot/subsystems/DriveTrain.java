package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.JoystickDrive;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotMap;


public class DriveTrain extends Subsystem {
  public boolean p = true;
    public void initDefaultCommand() {
       
    	setDefaultCommand(new JoystickDrive());
    }
    public void drive(double x,double y) {
        RobotMap.driveSystem.tankDrive(-x, y);
    } 
    public void drive(Joystick joy,double mult) {
        if(p == false){
        drive(joy.getRawAxis(5)*-mult,joy.getRawAxis(1)*mult);
        }
        else if (p == true){
        drive(joy.getRawAxis(5)*mult, joy.getRawAxis(1)*-mult);
        }
    }

	
}

