package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase{
    
    private SparkMax indexMotor;

    public Indexer() {

        indexMotor = new SparkMax(24, MotorType.kBrushless);

    }

    public Command runIndexer() {
        return run(() -> {
            indexMotor.setVoltage(5);
        });
    }
    
    public Command stopIndexer() {
        return run(() -> {
            indexMotor.setVoltage(0);
        });
    }
}
