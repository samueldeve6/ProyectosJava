/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borrar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Borrar extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
       Button btn = new Button();
       btn.setText("Hola mundo");
       btn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e) {
               System.out.println("Hola mundo");
           }
       });
       StackPane root = new StackPane();
       root.getChildren().add(btn);
       Scene scene = new Scene(root,300,300);
       stage.setTitle("Hola mundo");
       stage.setScene(scene);
       stage.show();
    }
    
}
