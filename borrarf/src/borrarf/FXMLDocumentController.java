/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borrarf;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    
    String path = "C:\\Users\\Usuario\\Desktop\\PinkFloydMarooned.mp3";
    Media media = new Media(new File(path).toURI().toString());
    MediaPlayer mediaPlayer =  new MediaPlayer(media);
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void playSound(ActionEvent event) {
        mediaPlayer.play();
    }

   
    
    
}
