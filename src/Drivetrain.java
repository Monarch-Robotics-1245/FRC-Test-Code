import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Drivetrain extends Subsystem {

    public MecanumDrive mecanumDrive;
    //public DifferentialDrive tankDrive;

    public WPI_TalonSRX fL, fR, bL, bR;
    public Drivetrain(int fL, int fR, int bL, int bR){
        this.fL = new WPI_TalonSRX(fL);
        this.fR = new WPI_TalonSRX(fR);
        this.bL = new WPI_TalonSRX(bL);
        this.bR = new WPI_TalonSRX(bR);

        this.fL.setNeutralMode(NeutralMode.Brake);
        this.fR.setNeutralMode(NeutralMode.Brake);
        this.bL.setNeutralMode(NeutralMode.Brake);
        this.bR.setNeutralMode(NeutralMode.Brake);

        mecanumDrive = new MecanumDrive(this.fL,this.fR, this.bL, this.bR);
        //tankDrive = new DifferentialDrive(this.fL, this.fR);
    }

    @Override
    protected void initDefaultCommand() {

    }

    public MecanumDrive getMecanumDrive(){
        return mecanumDrive;
    }

//    public DifferentialDrive getTankDrive(){
//        return tankDrive;
//    }
}
