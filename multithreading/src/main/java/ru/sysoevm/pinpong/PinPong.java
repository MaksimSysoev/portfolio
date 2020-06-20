package ru.sysoevm.pinpong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class PinPong extends Application {
    private static final String SYSOEVM = "Пинг-понг ru.sysoevm";

    @Override
    public void start(Stage stage) throws InterruptedException {
        int limitX = 300;
        int limitY = 300;
        Group group = new Group();
        Rectangle rect1 = new Rectangle(50, 100, 10, 10);
        group.getChildren().add(rect1);
        Thread t = new Thread(new RectangleMove(rect1));
        t.start();
        stage.setScene(new Scene(group, limitX, limitY));
        stage.setTitle(SYSOEVM);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest((WindowEvent event1) -> {
            t.interrupt();
            System.out.println("Поток прерван");
        });
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
