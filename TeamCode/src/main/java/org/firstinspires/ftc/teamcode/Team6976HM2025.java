package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Team6976HM2025 {
    public DcMotor DriveRightBack = null;
    public DcMotor DriveLeftBack = null;
    public DcMotor DriveLeftFront = null;
    public DcMotor DriveRightFront = null;
    public Servo Meowcat1 = null;

    public double name = 0;
public Servo Meowcat2 = null;



    HardwareMap hwMap = null;
    //FIX AND USE IT
    public void Map(HardwareMap hardwareMap)
    {
        hwMap = hardwareMap;
        DriveLeftFront = hwMap.get(DcMotor.class,"DriveLeftFront");
        DriveRightFront = hwMap.get(DcMotor.class,"DriveRightFront");
        DriveLeftBack = hwMap.get(DcMotor.class,"DriveLeftBack");
        DriveRightBack = hwMap.get(DcMotor.class,"DriveRightBack");
        //   Lights = hwMap.get(RevBlinkinLedDriver.class,"Lights");
        Meowcat1 = hwMap.get(Servo.class,"Meowcat1");
        Meowcat2 = hwMap.get(Servo.class, "Meowcat2");
        DriveLeftFront.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        DriveLeftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        DriveRightFront.setDirection(DcMotor.Direction.REVERSE);
        DriveRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        DriveRightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        DriveLeftBack.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        DriveLeftBack.  setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        DriveRightBack.setDirection(DcMotor.Direction.REVERSE);
        DriveRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        DriveRightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

//        ColorSensor = hwMap.get(NormalizedColorSensor.class, "sensor");
    }
}
