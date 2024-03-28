package Command;

import javafx.fxml.FXML;

import java.security.cert.CertPath;

public class Controller {
    private String state;
    private Command play;
    private Command pause;
    public Controller(){
        this.play = new Play();
        this.pause = new Pause();
    }

    @FXML
    private void PressPlay(){
        this.play.Execute();
    }
    @FXML
    private void PressPause(){
        this.pause.Execute();
    }
    private void PressSkip(){

    }
}
