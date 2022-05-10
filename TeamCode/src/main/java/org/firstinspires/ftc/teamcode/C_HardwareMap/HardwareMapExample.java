package org.firstinspires.ftc.teamcode.C_HardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "HardwareMapExample", group = "test")
public class HardwareMapExample extends LinearOpMode{

	DcMotor testMotor;

	@Override
	public void runOpMode() throws InterruptedException{

		testMotor = hardwareMap.get(DcMotor.class, "testMotor");

		waitForStart();
	}
}
