package org.firstinspires.ftc.teamcode.D_Methods;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Methods Example", group = "Example")
public class MethodsExample extends LinearOpMode {

    /*
     * All of this code here gets run when the Robot Controller app is launched
     * */

    DcMotor testMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        /*
         * Everything here gets run when you press "Init" on the driver controller
         * */

        testMotor = hardwareMap.get(DcMotor.class, "testMotor");

        waitForStart(); // Will wait for the start button to be pressed on the driver controller

        /*
         * Everything here gets run after you press "Start" on the driver controller
         * */

        voidMethod(); //Will run the voidMethod defined at the bottom of this program

        parameterMethod(0.5); //Will run the parameterMethod defined at the bottom of this program

        testMotor.setPower(nonVoidMethod(0.5, 0.25)); //When the power is set to the motor, it will run the nonVoidMethod to calculate a value. The value the method returns will be set as the power to the motor.

    }

    void voidMethod() { //This method has no parameters, so it ccan be run simply by calling voidMethod();
        testMotor.setPower(0); //Sets the motor power to zero, so it stops the motor
    } //Goes back to where this method was called from

    void parameterMethod(double Power) { //This method contains parameters which have to be defined when calling the method. These methods just act as variables within the methods, and can be used the same way as any other variable, except only within the scope of the method.
        testMotor.setPower(Power); //Sets the motor power to whatever we set the Power parameter too when calling the method.
    } //Goes back to where this method was called from

    double nonVoidMethod(double a, double b) { //This method is a double method, meaning it has to return a value which is a double. It also contains two parameters that have to be defined when calling the method.
        double c = a + b; //Creates a new variable, c, and sets it equal to the sum of a and b

        return c; //Since this method is a double, it has to return some value that is a double. This tells the method to return the value of c when done. That value will then be set as the motor power in the program itself.
    } //Goes back to where this method was called from
}
