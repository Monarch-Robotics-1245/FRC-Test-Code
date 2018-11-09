import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class Mecanum extends Command {
    public Mecanum(){
        requires(Main.drivetrain);
    }
    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void execute(){
        double x = Controller.pad.getX(GenericHID.Hand.kLeft);
        double y = Controller.pad.getY(GenericHID.Hand.kLeft);
        double twist = Controller.pad.getX(GenericHID.Hand.kRight);

        //Main.drivetrain.getMecanumDrive().driveCartesian(x,y,twist,0);
    }

}
