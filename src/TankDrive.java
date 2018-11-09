import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

    public TankDrive() {
        requires(Main.drivetrain);
    }

    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void execute(){
        double speed = Controller.pad.getY(GenericHID.Hand.kLeft);
        double rotation = Controller.pad.getX(GenericHID.Hand.kRight);

        Main.drivetrain.getTankDrive().arcadeDrive(speed, rotation);
    }
}
