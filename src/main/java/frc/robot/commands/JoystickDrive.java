package  frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 *
 */
public class JoystickDrive extends Command {
int x;
    public JoystickDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.IO.j1_3.get()) {
    		Robot.drivetrain.drive(Robot.IO.joy1,0.6);
    	}
    	else if(Robot.IO.j1_4.get()) {
    		Robot.drivetrain.drive(Robot.IO.joy1,1);
    	}
    	else {
    		Robot.drivetrain.drive(Robot.IO.joy1,0.75);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.drive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}