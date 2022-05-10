# The HardwareMap

<p>So, we've created our OpMode, but now we want to have access to our hardware, and be able to control our robots mechanisms.</p>
<p>To gain access to our hardware, we need to use the HardwareMap

## What is the HardwareMap?

![Hardware Map](hardwaremap.svg)

<p>The har</p>

## Getting access to Hardware

<p>To get access to our hardware, we first need an object that can interface with our hardware.</p>

```
DcMotor testMotor;
```

<p>Now that we've created a motor object, we need to link the object we created to the hardware using the hardware map</p>

```
public void runOpMode() throws InterruptedException{

    testMotor = hardwareMap.get(DcMotor.class, "testMotor");

    waitForStart();
}
```