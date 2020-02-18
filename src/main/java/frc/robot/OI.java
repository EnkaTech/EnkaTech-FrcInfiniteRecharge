/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ClimbManuel;
import frc.robot.commands.HazneManuel;
import frc.robot.commands.Intake;
import frc.robot.commands.LEDcontrol;
import frc.robot.commands.LuckywheelManuel;
import frc.robot.commands.ManuelAngle;
import frc.robot.commands.ShooterAngle;
import frc.robot.commands.ShooterManuel;

public class OI {
  public Joystick joy1 = new Joystick(0);
  public Joystick joy2 = new Joystick(1);

  public Button Green = new JoystickButton(joy1, 2);
  public Button Red = new JoystickButton(joy1, 3);
  public Button Blue = new JoystickButton(joy1, 1);
  public Button Yellow = new JoystickButton(joy1, 4);
  public Button L1 = new JoystickButton(joy1, 5);
  public Button R1 = new JoystickButton(joy1, 6);
  public Button Back = new JoystickButton(joy1, 7);
  public Button Start = new JoystickButton(joy1, 8);

  
  
  public Button Green2 = new JoystickButton(joy2, 1);
  public Button Red2 = new JoystickButton(joy2, 2);
  public Button Blue2 = new JoystickButton(joy2, 3);
  public Button Yellow2 = new JoystickButton(joy2, 4);
  public Button L12 = new JoystickButton(joy2, 5);
  public Button R12= new JoystickButton(joy2, 6);
  public Button Back2 = new JoystickButton(joy2, 7);
  public Button Start2 = new JoystickButton(joy2, 8);
  public Button L32 = new JoystickButton(joy2, 9);
  public Button R32 = new JoystickButton(joy2, 10);
   public OI(){
     Yellow2.whileHeld(new ClimbManuel(1));
     Green2.whileHeld(new ClimbManuel(-1));
     L1.whileHeld(new ShooterManuel(1));
     Red.whileHeld(new ManuelAngle(1));
     Blue.whileHeld(new ManuelAngle(-1));
     Start2.whileHeld(new HazneManuel(1));
     Back2.whileHeld(new HazneManuel(-1));
     R12.whileHeld(new LuckywheelManuel(1));
     Green.whileHeld(new LEDcontrol(1));
     Yellow.whileHeld(new LEDcontrol(0));
     R1.whileHeld(new Intake(1));
     Start.whenPressed(new ShooterAngle());

   }
}
