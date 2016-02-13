package org.usfirst.frc.team449.robot.mechanism.breach.commands;

import org.usfirst.frc.team449.robot.drive.tank.commands.DriveDistance;
import org.usfirst.frc.team449.robot.mechanism.breach.BreachMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BreachPortcullis extends CommandGroup {
	public BreachPortcullis() {
		addSequential(new SetWedgePortcullis());
		addSequential(new DriveDistance(BreachMap.BREACH_DISTANCE));
	}
}
