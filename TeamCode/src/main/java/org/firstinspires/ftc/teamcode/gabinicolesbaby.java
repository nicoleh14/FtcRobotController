package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
public class gabinicolesbaby extends OpMode {

    @Override
    public void init() {
       telemetry.addData("Hello:", "Nicole" );// My First Comment
    }

    @Override
    public void loop() {
    }

    //This is a Single Line Comment
    /*
    1. Hello: Instead of Hello World make the telemetary data show "Hello: Your Name"
    2. Run this code in the Autonomous section of your DS
     */
}

