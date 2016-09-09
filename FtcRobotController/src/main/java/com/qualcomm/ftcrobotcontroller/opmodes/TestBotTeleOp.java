package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
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

import junit.framework.Test;

/**
 * Created by Joshua Young on 9/8/2016.
 */
public abstract class TestBotTeleOp extends OpMode {

    DcMotor Right;
    DcMotor Left;

    @Override
    public void init() {

        Right = hardwareMap.dcMotor.get("Right Motor");
        Left = hardwareMap.dcMotor.get("Left Motor");





    }
    @Override
    public void loop (){

        float forward = -gamepad1.right_trigger;
        float back = -gamepad1.left_trigger;

        forward = Range.clip(forward, -1, 1);
        back = Range.clip(back, -1, 1);

        Right.setPower(forward);
        Left.setPower(forward);

        Right.setPower(back);
        Left.setPower(back);



    }
}
