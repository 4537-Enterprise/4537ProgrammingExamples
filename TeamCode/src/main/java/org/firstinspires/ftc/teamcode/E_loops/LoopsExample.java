package org.firstinspires.ftc.teamcode.E_loops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class LoopsExample extends LinearOpMode {

    /*
     * All of this code here gets run when the Robot Controller app is launched
     * */

    @Override
    public void runOpMode() throws InterruptedException {

        /*
         * Everything here gets run when you press "Init" on the driver controller
         * */

        waitForStart(); // Will wait for the start button to be pressed on the driver controller

        /*
         * Everything here gets run after you press "Start" on the driver controller
         * */

        while (opModeIsActive()) { //While loops are loops that will run forever as long as a statement is true
            //"opModeIsActive()" is a boolean method. This method either returns true or false depending on whether the opMode is actually running or not
            //As long as "opModeIsActive()" is true, this while loop will continuously be looped through... hence the name.
            //This is how we can get looping behavior in TeleOp programs. Without this, all the code would be run through once and the program would stop immediately
        }

        for (int i = 1; i < 5; i++) { //For loops are great for running something a certain number of times
            //The for loop has three major steps: the initializer, the condition, and the step.
            //The initializer is the "int i = 1" statement. It initializes the variable we will use in he next two steps
            //The condition is checked at the end of each run of the for loop. If the condition is true, the for loop will continue. If the condition is false, it will move on to the next set of instructions within the program.
            //The step is also run at the end of each run of the for loop. Right after the conditioned is checked, it will run the step. Most of the time, the step will increment the variable, but anything can be run in the step.
        }

    }
}
