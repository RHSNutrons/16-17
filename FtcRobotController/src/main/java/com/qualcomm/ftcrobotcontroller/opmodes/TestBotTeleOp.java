package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.configuration.MotorConfiguration;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.DeviceManager;





/**
 * Created by Juan Rivera on 9/16/2016.
 */
public abstract class TestBotTeleOp extends OpMode{
    //motors
    DcMotor motorRight;
    DcMotor motorLeft;

public void start (){
    //mapping out the motors
    motorRight = hardwareMap.dcMotor.get("motor_1");
    motorLeft = hardwareMap.dcMotor.get("motor_2");
    }
    public void loop () {
    //throttle and direction
        float throttle = -gamepad1.left_stick_y;
        float direction = gamepad1.left_stick_x;
    //tank drive calculations
        float right = throttle - direction;
        float left = throttle + direction;

    //setting the motor powers
        motorRight.setPower(right);
        motorLeft.setPower(left);

    }


}
