# OpModes

<p>An OpMode is a program that the robot can run. OpModes will show up in either the TeleOp or Autonomous lists on the Driver Controller.</p>
<p>There are two types of OpModes:</p>

1) Autonomous: This OpMode is designed to be run in the 30 Second autonomous period at the beginning of the match. No driver input is allowed during this time
2) TeleOp: This OpMode is design to be run in the 2 minute driver control period after the autonomous period. Driver input is allowed during this period.

<p>In general, an autonomous will go through a set of pre-programmed instructions once, a teleop will continuously loop through some control logic</p>

## Creating an OpMode

Typically, OpMode files are stored in the "teamcode" folder. Creating an OpMode is easy, just follow these steps:

1) Create a Java Class. This is done by right clicking in the explorer view on the left hand side of your screen in Android Studio. Select New > Java Class. Give it a name.
2) Next to the class name in the java file, you need to extend "LinearOpMode". This will give the program access to various things necessary for OpMode operation.
```
public class Autonomous extends LinearOpMode {
```
3) We now need to implement the methods that LinearOpMode needs. We do this by clicking in the class name (it should be underlined red), pressing ALT+ENTER, and then select "implement methods". Click ok, and now you will have some extra code in your program.
4) Finally, we need to state that this program is an Autonomous or a TeleOp, we do this by adding "@Autonomous" or "@TeleOp" above the class name.
```
// If you are doing a Autonomous
@Autonomous(name = "the name you want", group = "anything, this doesn't do much")

// Or, if you are doing a TeleOp
@TeleOp(name = "the name you want", group = "anything, this doesn't do much")
```
5) Now it is time to add one piece of logic that allows the program to function as an opmode. Inside the "runOpMode()" method, add "waitForStart()".
```
public void runOpMode() throws InterruptedException{
    
    /*
    * Everything here gets run when you press "Init" on the driver controller
    * */
    
    waitForStart(); // Will wait for the start button to be pressed on the driver controller
    
    /*
    * Everything here gets run after you press "Start" on the driver controller
    * */

}
```
6) Yay! you have now successfully made an OpMode!

## What does this do?

<p>We just went through a lot of info, so lets go over what it actually does:</p>

### @Autonomous and @TeleOp

```
@Autonomous(name = "the name you want", group = "anything, this doesn't do much")
```

<p>This line of code defines to the driver controller that this java class is an OpMode. It allows you to define it either as an Autonomous, or a TeleOp, and allows for you to give your program a name.</p>

### extends LinearOpMode

```
public class Autonomous extends LinearOpMode {
```

<p>This line of code gives the class access to a whole bunch of necessary features for the class to function as an OpMode.</p>

### Implementing the methods

<p>So you may have noticed that when we implemented the methods for LinearOpMode, some code was added to our class.</p>

```
public void runOpMode() throws InterruptedException{
```

<p>This code is necessary for the program to run. When the Init button is pressed on the driver controller for this OpMode, it calls this method. Everything inside of this method gets run through one time, although there are things that allow us to run things multiple times</p>

### waitForStart()

```
waitForStart()
```

<p>the waitForStart() method comes from extending LinearOpMode. This method allows us to pause at its line and wait for the start button to be pressed on the driver controller. This allows us to initialize and wait before running the rest of the code.</p>
