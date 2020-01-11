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
public class OI {
  public Joystick joy1 = new Joystick(0);
  public Joystick joy2 = new Joystick(1);
  public Button Green = new JoystickButton(joy1, 1);
  public Button Red = new JoystickButton(joy1, 2);
  public Button Blue = new JoystickButton(joy1, 3);
  public Button Yellow = new JoystickButton(joy1, 4);
  public Button L1 = new JoystickButton(joy1, 5);
  public Button R1 = new JoystickButton(joy1, 6);
  public Button Back = new JoystickButton(joy1, 7);
  public Button Start = new JoystickButton(joy1, 8);
  public Button LeftT = new JoystickButton(joy1, 9);
  public Button RightT = new JoystickButton(joy1, 10);
  
  
  public Button Hit = new JoystickButton(joy2, 1);
  public Button Thumb = new JoystickButton(joy2, 2);
  public Button Left1 = new JoystickButton(joy2, 3);
  public Button Right1 = new JoystickButton(joy2, 4);
  public Button Left2 = new JoystickButton(joy2, 5);
  public Button Right2 = new JoystickButton(joy2, 6);
  public Button Yellow3 = new JoystickButton(joy2, 7);
  public Button Red3 = new JoystickButton(joy2, 8);
  public Button Yellow2 = new JoystickButton(joy2, 9);
  public Button Red2  = new JoystickButton(joy2, 10);
  public Button Yellow1 = new JoystickButton(joy2, 11);
  public Button Red1 = new JoystickButton(joy2, 12);
}
