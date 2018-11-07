import edu.wpi.first.wpilibj.IterativeRobot;

public class Main extends IterativeRobot {
    public static Controller controller;
    public static Drivetrain drivetrain = new Drivetrain(Ports.fL,Ports.fR,Ports.bL,Ports.bR);

    @Override
    public void robotInit(){
        controller = new Controller();
    }
}
