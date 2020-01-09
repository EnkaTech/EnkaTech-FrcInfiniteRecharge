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
  // Elevator encoder (AMT-103V)
  public static Encoder visionencoder = new Encoder(0, 1, false, EncodingType.k4X);
  private static double shooterPPR = 2048;
  public static double elevatorAPR = 360 / shooterPPR;
  


  public static double getDistance() {
    double dist = rangeInput.getVoltage();
    dist = RobotMap.map(dist, 0.28, 4.67, 0.2, 5.5) * 100;
    return dist;
  }

  public static ADIS16448_IMU gyro = new ADIS16448_IMU();
  // DriveTrain
  public static SpeedController leftMotor1 = new WPI_VictorSPX(4);
  public static SpeedController leftMotor2 = new WPI_VictorSPX(3);
  public static SpeedController  rightMotor1= new WPI_TalonSRX(1);
  public static SpeedController  rightMotor2= new WPI_TalonSRX(2);
    
  public static SpeedController left= new SpeedControllerGroup(leftMotor1,leftMotor2);
	public static SpeedController right= new SpeedControllerGroup(rightMotor1,rightMotor2);
	public static DifferentialDrive driveSystem = new DifferentialDrive(left,right);

  // Hazne
  private static SpeedController HazneMotor1 = new VictorSP(5);
  private static SpeedController HazneMotor2 = new VictorSP(1);
  public static SpeedControllerGroup HazneMotorları = new SpeedControllerGroup(HazneMotor1,  HazneMotor2);

  // Intake
  public static SpeedController wheel1 = new VictorSP(2);
  public static SpeedController wheel2 = new VictorSP(3);

  //Shooter
  public static SpeedController jointMotor = new WPI_VictorSPX(5);

  // Solenoidler
  public static DoubleSolenoid modeSolenoid = new DoubleSolenoid(4, 5);
  public static DoubleSolenoid hatchSolenoid = new DoubleSolenoid(6, 7);

  }
