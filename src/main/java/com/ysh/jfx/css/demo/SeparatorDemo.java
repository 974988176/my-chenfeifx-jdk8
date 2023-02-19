package com.ysh.jfx.css.demo;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月9日
 * <p>
 * 原生Separator样式美化案例
 */
public class SeparatorDemo extends StackPane {

    private VBox vBox = new VBox();
    private VBox box1 = new VBox();
    private HBox box2 = new HBox();

    {
        this.getChildren().add(vBox);
        vBox.getChildren().addAll(box1, box2);
        vBox.setSpacing(20);
        box1.setSpacing(20);
        box2.setSpacing(20);
        box2.setPrefHeight(300);
        box2.setAlignment(Pos.CENTER);
    }

    public SeparatorDemo() {
        addContent();
    }

    private void addContent() {
        String[] styleClass = {"cf-separator", "cf-primary-separator", "cf-success-separator", "cf-info-separator", "cf-warn-separator", "cf-danger-separator"};
        int length = styleClass.length;
        //横向分隔线
        for (int i = 0; i < length; i++) {
            Separator separator = new Separator();
            separator.getStyleClass().add(styleClass[i]);
            box1.getChildren().add(separator);
        }
        //纵向分隔线
        for (int i = 0; i < length; i++) {
            Separator separator = new Separator();
            separator.getStyleClass().add(styleClass[i]);
            separator.setOrientation(Orientation.VERTICAL);
            box2.getChildren().add(separator);
        }
    }

}
