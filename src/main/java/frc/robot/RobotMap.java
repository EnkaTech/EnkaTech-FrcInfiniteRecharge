/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.analog.adis16448.frc.ADIS16448_IMU;
import edu.wpi.first.wpilibj.drive.DifferentialDrive; 

public class RobotMap {

  public static ADIS16448_IMU gyro = new ADIS16448_IMU();
  // DriveTrain
  public static SpeedController leftMotor1 = new VictorSP(1);
  public static SpeedController leftMotor2 = new VictorSP(2);
  public static SpeedController  rightMotor1= new VictorSP(3);
  public static SpeedController  rightMotor2= new VictorSP(4);    
  public static SpeedControllerGroup left= new SpeedControllerGroup(leftMotor1,leftMotor2);
	public static SpeedControllerGroup right= new SpeedControllerGroup(rightMotor1,rightMotor2);
	public static DifferentialDrive driveSystem = new DifferentialDrive(left,right);
  // Hazne
  public static VictorSPX HazneMotor1 = new VictorSPX(11);
  public static VictorSPX HazneMotor2 = new VictorSPX(12);
  // Intake
  public static VictorSPX wheel1 = new VictorSPX(13);
  //Shooter
  public static VictorSPX ShooterMotor2 = new VictorSPX(5);
  public static VictorSPX ShooterMotor1 = new VictorSPX(7);
  public static VictorSPX ShooterAngleMotor = new VictorSPX(6);
  //Çark 
  public static SpeedController LuckyWheel = new VictorSP(5);
  //Tırmanma
  public static SpeedController Climb1 = new VictorSP(6);
  public static SpeedController Climb2 = new VictorSP(7);

  }
