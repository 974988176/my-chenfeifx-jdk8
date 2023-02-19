package com.ysh.jfx.css.demo;

import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.Random;

/**
 * @author ChenFei
 * @date 2022年6月9日
 * <p>
 * 原生ProgressBar样式美化案例
 */
public class ProgressBarDemo extends StackPane {

    public VBox vBox = new VBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.setSpacing(20);
    }

    public ProgressBarDemo() {
        addContent();
    }

    private void addContent() {
        String[] classArr = {"cf-progress-bar", "cf-primary-progress-bar", "cf-success-progress-bar",
                "cf-info-progress-bar", "cf-warn-progress-bar", "cf-danger-progress-bar"};

        for (int i = 0; i < classArr.length; i++) {
            ProgressBar pb = new ProgressBar();//不确定的
            pb.getStyleClass().add(classArr[i]);
            vBox.getChildren().add(pb);
        }

        for (int i = 0; i < classArr.length; i++) {
            ProgressBar pb = new ProgressBar(new Random().nextDouble());//确定的
            pb.getStyleClass().add(classArr[i]);
            vBox.getChildren().add(pb);
        }
    }

}
