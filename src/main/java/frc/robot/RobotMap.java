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

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.analog.adis16448.frc.ADIS16448_IMU;
import edu.wpi.first.wpilibj.drive.DifferentialDrive; 

public class RobotMap {

  public static ADIS16448_IMU gyro = new ADIS16448_IMU();
  //DriveTrain
  public static SpeedController leftMotor1 = new VictorSP(8);
  public static SpeedController leftMotor2 = new VictorSP(9);
  public static SpeedController  rightMotor1= new VictorSP(0);
  public static SpeedController  rightMotor2= new VictorSP(4);    
  public static SpeedControllerGroup left= new SpeedControllerGroup(leftMotor1,leftMotor2);
	public static SpeedControllerGroup right= new SpeedControllerGroup(rightMotor1,rightMotor2);
	public static DifferentialDrive driveSystem;
  //Tırmanma 
  public static VictorSPX Climb1 = new VictorSPX(4);
  public static VictorSPX Climb2 = new VictorSPX(5);
  //Intake
  public static VictorSP intake = new VictorSP(1);
  //Shooter
  public static TalonSRX ShooterMotor2 = new TalonSRX(1);
  public static TalonSRX ShooterMotor1 = new TalonSRX(2);
  public static TalonSRX ShooterAngleMotor = new TalonSRX(3);
  //Çark 
  public static SpeedController LuckyWheel = new VictorSP(3);
  //Hazne
  public static SpeedController HazneMotor2  = new VictorSP(6);
  public static SpeedController HazneMotor1  = new VictorSP(7);
  //LED
  public static VictorSP LED = new VictorSP(2);
  public static boolean lightsOn = false;
  }
