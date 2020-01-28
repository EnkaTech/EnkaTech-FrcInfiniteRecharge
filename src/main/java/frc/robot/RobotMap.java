/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import com.analog.adis16448.frc.ADIS16448_IMU;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
/**
   * Changes the input value to match the desired range. This is especially useful
   * when getting distance values from encoders and rangefinders.
   * 
   * @param x       Input value
   * @param in_min  Minimum known value of the input
   * @param in_max  Maximum known value of the input
   * @param out_min Desired output value for in_min
   * @param out_max Desired output value for in_max
   */
  public static double map(double x, double in_min, double in_max, double out_min, double out_max) {
    return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
  }
 
  // Sensorler
  private static AnalogInput rangeInput = new AnalogInput(0);
  public static Encoder HazneEncoder = new Encoder(2, 3, false, EncodingType.k4X);
  private static double HaznePPR = 2048;
  public static double HazneDPR = (1 / HaznePPR)*12;

  public static double getDistance() {
    double dist = rangeInput.getVoltage();
    dist = RobotMap.map(dist, 0.28, 4.67, 0.2, 5.5) * 100;
    return dist;
  }

  public static ADIS16448_IMU gyro = new ADIS16448_IMU();
  // DriveTrain
  public static SpeedController leftMotor1 = new VictorSP(6);
  public static SpeedController leftMotor2 = new VictorSP(7);
  public static SpeedController  rightMotor1= new VictorSP(8);
  public static SpeedController  rightMotor2= new VictorSP(9);    
  public static SpeedControllerGroup left= new SpeedControllerGroup(leftMotor1,leftMotor2);
	public static SpeedControllerGroup right= new SpeedControllerGroup(rightMotor1,rightMotor2);
	public static DifferentialDrive driveSystem = new DifferentialDrive(left,right);
  // Hazne
  public static SpeedController HazneMotor1 = new VictorSP(5);
  public static SpeedController HazneMotor2 = new VictorSP(1);
  // Intake
  public static SpeedController wheel1 = new VictorSP(2);
  //Shooter
  public static SpeedController ShooterMotor2 = new WPI_VictorSPX(5);
  public static SpeedController ShooterMotor1 = new WPI_VictorSPX(9);
  public static SpeedController ShooterAngleMotor = new WPI_VictorSPX(6);
  //Çark 
  public static SpeedController LuckyWheel = new WPI_VictorSPX(7);
  //Tırmanma
  public static SpeedController Climb1 = new WPI_VictorSPX(8);
  public static SpeedController Climb2 = new WPI_VictorSPX(9);
  // Solenoidler
  public static DoubleSolenoid IntakeSolenoid = new DoubleSolenoid(4, 5);
  public static DoubleSolenoid WheelSolenoid = new DoubleSolenoid(6, 7);
  }
