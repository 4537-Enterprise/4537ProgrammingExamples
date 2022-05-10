# OpModes

<p>An OpMode is a program that the robot can run. OpModes will show up in either the TeleOp or Autonomous lists on the Driver Controller.</p>
<p>There are two types of OpModes:</p>

1) Autonomous: This OpMode is designed to be run in the 30 Second autonomous period at the beginning of the match. No driver input is allowed during this time
2) TeleOp: This OpMode is design to be run in the 2 minute driver control period after the autonomous period. Driver input is allowed during this period.

<p>In general, an autonomous will go through a set of pre-programmed instructions once, a teleop will continuously loop through some control logic</p>

# Creating an OpMode

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
5) Adding 
