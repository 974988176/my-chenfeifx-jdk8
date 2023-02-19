package com.ysh.jfx.css;

import com.ysh.jfx.css.view.HomeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author ChenFei
 * @date 2022年6月7日
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new HomeView(), 1000, 600);
        scene.getStylesheets().addAll(
                App.class.getResource("/chenfei/color.css").toExternalForm(),// 添加色彩
                App.class.getResource("/chenfei/core.css").toExternalForm()// 添加css
        );
        stage.setTitle("ChenFei JavaFx css !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
