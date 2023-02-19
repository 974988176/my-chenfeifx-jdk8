package com.ysh.jfx.css.demo;

import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;
/**
 * @author ChenFei
 * @date 2022年6月9日
 * <p>
 * 原生ProgressIndicator样式美化案例
 */
public class ProgressIndicatorDemo extends StackPane {

    ProgressIndicator pb = new ProgressIndicator();

    {
        this.getChildren().add(pb);
        pb.getStyleClass().add("cf-progress-indicator");
    }

}
