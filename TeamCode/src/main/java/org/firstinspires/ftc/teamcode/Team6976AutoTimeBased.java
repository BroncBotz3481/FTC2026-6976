package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Team4008AutoTimeBased", group="4008")
public class Team6976AutoTimeBased extends LinearOpMode {

    Team6976HM2025 robot = new Team6976HM2025();
    ElapsedTime Time = new ElapsedTime();

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        sleep(3000);
        waitForStart();

        moveForward(0.5,1000); // This powers all the motors to move the robot forward for 1000 milseconds
    }

    public void moveForward (double power, int time){
        robot.DriveRightFront.setPower(-power);
        robot.DriveLeftFront.setPower(-power);
        robot.DriveRightBack.setPower(power);
        robot.DriveLeftBack.setPower(power);

    }
}